package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;

/**
 * Sets a desired vehicle position, velocity, and/or acceleration in a global coordinate system 
 * (WGS84). Used by an external controller to command the vehicle (manual controller or other 
 * system). 
 */
@MavlinkMessage(
    id = 86,
    crc = 5
)
public final class SetPositionTargetGlobalInt {
  /**
   * Timestamp in milliseconds since system boot. The rationale for the timestamp in the setpoint 
   * is to allow the system to compensate for the transport delay of the setpoint. This allows the 
   * system to compensate processing latency. 
   */
  private final long timeBootMs;

  /**
   * System ID 
   */
  private final int targetSystem;

  /**
   * Component ID 
   */
  private final int targetComponent;

  /**
   * Valid options are: MAV_FRAME_GLOBAL_INT = 5, MAV_FRAME_GLOBAL_RELATIVE_ALT_INT = 6, 
   * MAV_FRAME_GLOBAL_TERRAIN_ALT_INT = 11 
   */
  private final MavFrame coordinateFrame;

  /**
   * Bitmask to indicate which dimensions should be ignored by the vehicle: a value of 
   * 0b0000000000000000 or 0b0000001000000000 indicates that none of the setpoint dimensions 
   * should be ignored. If bit 10 is set the floats afx afy afz should be interpreted as force instead 
   * of acceleration. Mapping: bit 1: x, bit 2: y, bit 3: z, bit 4: vx, bit 5: vy, bit 6: vz, bit 7: ax, bit 
   * 8: ay, bit 9: az, bit 10: is force setpoint, bit 11: yaw, bit 12: yaw rate 
   */
  private final int typeMask;

  /**
   * X Position in WGS84 frame in 1e7 * degrees 
   */
  private final int latInt;

  /**
   * Y Position in WGS84 frame in 1e7 * degrees 
   */
  private final int lonInt;

  /**
   * Altitude in meters in AMSL altitude, not WGS84 if absolute or relative, above terrain if 
   * GLOBAL_TERRAIN_ALT_INT 
   */
  private final float alt;

  /**
   * X velocity in NED frame in meter / s 
   */
  private final float vx;

  /**
   * Y velocity in NED frame in meter / s 
   */
  private final float vy;

  /**
   * Z velocity in NED frame in meter / s 
   */
  private final float vz;

  /**
   * X acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N 
   */
  private final float afx;

  /**
   * Y acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N 
   */
  private final float afy;

  /**
   * Z acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N 
   */
  private final float afz;

  /**
   * yaw setpoint in rad 
   */
  private final float yaw;

  /**
   * yaw rate setpoint in rad/s 
   */
  private final float yawRate;

  private SetPositionTargetGlobalInt(long timeBootMs, int targetSystem, int targetComponent,
      MavFrame coordinateFrame, int typeMask, int latInt, int lonInt, float alt, float vx, float vy,
      float vz, float afx, float afy, float afz, float yaw, float yawRate) {
    this.timeBootMs = timeBootMs;
    this.targetSystem = targetSystem;
    this.targetComponent = targetComponent;
    this.coordinateFrame = coordinateFrame;
    this.typeMask = typeMask;
    this.latInt = latInt;
    this.lonInt = lonInt;
    this.alt = alt;
    this.vx = vx;
    this.vy = vy;
    this.vz = vz;
    this.afx = afx;
    this.afy = afy;
    this.afz = afz;
    this.yaw = yaw;
    this.yawRate = yawRate;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Timestamp in milliseconds since system boot. The rationale for the timestamp in the setpoint 
   * is to allow the system to compensate for the transport delay of the setpoint. This allows the 
   * system to compensate processing latency. 
   */
  @MavlinkMessageField(
      position = 1,
      length = 4
  )
  public final long timeBootMs() {
    return timeBootMs;
  }

  /**
   * System ID 
   */
  @MavlinkMessageField(
      position = 2,
      length = 1
  )
  public final int targetSystem() {
    return targetSystem;
  }

  /**
   * Component ID 
   */
  @MavlinkMessageField(
      position = 3,
      length = 1
  )
  public final int targetComponent() {
    return targetComponent;
  }

  /**
   * Valid options are: MAV_FRAME_GLOBAL_INT = 5, MAV_FRAME_GLOBAL_RELATIVE_ALT_INT = 6, 
   * MAV_FRAME_GLOBAL_TERRAIN_ALT_INT = 11 
   */
  @MavlinkMessageField(
      position = 4,
      length = 1
  )
  public final MavFrame coordinateFrame() {
    return coordinateFrame;
  }

  /**
   * Bitmask to indicate which dimensions should be ignored by the vehicle: a value of 
   * 0b0000000000000000 or 0b0000001000000000 indicates that none of the setpoint dimensions 
   * should be ignored. If bit 10 is set the floats afx afy afz should be interpreted as force instead 
   * of acceleration. Mapping: bit 1: x, bit 2: y, bit 3: z, bit 4: vx, bit 5: vy, bit 6: vz, bit 7: ax, bit 
   * 8: ay, bit 9: az, bit 10: is force setpoint, bit 11: yaw, bit 12: yaw rate 
   */
  @MavlinkMessageField(
      position = 5,
      length = 2
  )
  public final int typeMask() {
    return typeMask;
  }

  /**
   * X Position in WGS84 frame in 1e7 * degrees 
   */
  @MavlinkMessageField(
      position = 6,
      length = 4
  )
  public final int latInt() {
    return latInt;
  }

  /**
   * Y Position in WGS84 frame in 1e7 * degrees 
   */
  @MavlinkMessageField(
      position = 7,
      length = 4
  )
  public final int lonInt() {
    return lonInt;
  }

  /**
   * Altitude in meters in AMSL altitude, not WGS84 if absolute or relative, above terrain if 
   * GLOBAL_TERRAIN_ALT_INT 
   */
  @MavlinkMessageField(
      position = 8,
      length = 4
  )
  public final float alt() {
    return alt;
  }

  /**
   * X velocity in NED frame in meter / s 
   */
  @MavlinkMessageField(
      position = 9,
      length = 4
  )
  public final float vx() {
    return vx;
  }

  /**
   * Y velocity in NED frame in meter / s 
   */
  @MavlinkMessageField(
      position = 10,
      length = 4
  )
  public final float vy() {
    return vy;
  }

  /**
   * Z velocity in NED frame in meter / s 
   */
  @MavlinkMessageField(
      position = 11,
      length = 4
  )
  public final float vz() {
    return vz;
  }

  /**
   * X acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N 
   */
  @MavlinkMessageField(
      position = 12,
      length = 4
  )
  public final float afx() {
    return afx;
  }

  /**
   * Y acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N 
   */
  @MavlinkMessageField(
      position = 13,
      length = 4
  )
  public final float afy() {
    return afy;
  }

  /**
   * Z acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N 
   */
  @MavlinkMessageField(
      position = 14,
      length = 4
  )
  public final float afz() {
    return afz;
  }

  /**
   * yaw setpoint in rad 
   */
  @MavlinkMessageField(
      position = 15,
      length = 4
  )
  public final float yaw() {
    return yaw;
  }

  /**
   * yaw rate setpoint in rad/s 
   */
  @MavlinkMessageField(
      position = 16,
      length = 4
  )
  public final float yawRate() {
    return yawRate;
  }

  public static class Builder {
    private long timeBootMs;

    private int targetSystem;

    private int targetComponent;

    private MavFrame coordinateFrame;

    private int typeMask;

    private int latInt;

    private int lonInt;

    private float alt;

    private float vx;

    private float vy;

    private float vz;

    private float afx;

    private float afy;

    private float afz;

    private float yaw;

    private float yawRate;

    private Builder() {
    }

    /**
     * Timestamp in milliseconds since system boot. The rationale for the timestamp in the setpoint 
     * is to allow the system to compensate for the transport delay of the setpoint. This allows the 
     * system to compensate processing latency. 
     */
    @MavlinkMessageField(
        position = 1,
        length = 4
    )
    public final Builder timeBootMs(long timeBootMs) {
      this.timeBootMs = timeBootMs;
      return this;
    }

    /**
     * System ID 
     */
    @MavlinkMessageField(
        position = 2,
        length = 1
    )
    public final Builder targetSystem(int targetSystem) {
      this.targetSystem = targetSystem;
      return this;
    }

    /**
     * Component ID 
     */
    @MavlinkMessageField(
        position = 3,
        length = 1
    )
    public final Builder targetComponent(int targetComponent) {
      this.targetComponent = targetComponent;
      return this;
    }

    /**
     * Valid options are: MAV_FRAME_GLOBAL_INT = 5, MAV_FRAME_GLOBAL_RELATIVE_ALT_INT = 6, 
     * MAV_FRAME_GLOBAL_TERRAIN_ALT_INT = 11 
     */
    @MavlinkMessageField(
        position = 4,
        length = 1
    )
    public final Builder coordinateFrame(MavFrame coordinateFrame) {
      this.coordinateFrame = coordinateFrame;
      return this;
    }

    /**
     * Bitmask to indicate which dimensions should be ignored by the vehicle: a value of 
     * 0b0000000000000000 or 0b0000001000000000 indicates that none of the setpoint dimensions 
     * should be ignored. If bit 10 is set the floats afx afy afz should be interpreted as force instead 
     * of acceleration. Mapping: bit 1: x, bit 2: y, bit 3: z, bit 4: vx, bit 5: vy, bit 6: vz, bit 7: ax, bit 
     * 8: ay, bit 9: az, bit 10: is force setpoint, bit 11: yaw, bit 12: yaw rate 
     */
    @MavlinkMessageField(
        position = 5,
        length = 2
    )
    public final Builder typeMask(int typeMask) {
      this.typeMask = typeMask;
      return this;
    }

    /**
     * X Position in WGS84 frame in 1e7 * degrees 
     */
    @MavlinkMessageField(
        position = 6,
        length = 4
    )
    public final Builder latInt(int latInt) {
      this.latInt = latInt;
      return this;
    }

    /**
     * Y Position in WGS84 frame in 1e7 * degrees 
     */
    @MavlinkMessageField(
        position = 7,
        length = 4
    )
    public final Builder lonInt(int lonInt) {
      this.lonInt = lonInt;
      return this;
    }

    /**
     * Altitude in meters in AMSL altitude, not WGS84 if absolute or relative, above terrain if 
     * GLOBAL_TERRAIN_ALT_INT 
     */
    @MavlinkMessageField(
        position = 8,
        length = 4
    )
    public final Builder alt(float alt) {
      this.alt = alt;
      return this;
    }

    /**
     * X velocity in NED frame in meter / s 
     */
    @MavlinkMessageField(
        position = 9,
        length = 4
    )
    public final Builder vx(float vx) {
      this.vx = vx;
      return this;
    }

    /**
     * Y velocity in NED frame in meter / s 
     */
    @MavlinkMessageField(
        position = 10,
        length = 4
    )
    public final Builder vy(float vy) {
      this.vy = vy;
      return this;
    }

    /**
     * Z velocity in NED frame in meter / s 
     */
    @MavlinkMessageField(
        position = 11,
        length = 4
    )
    public final Builder vz(float vz) {
      this.vz = vz;
      return this;
    }

    /**
     * X acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N 
     */
    @MavlinkMessageField(
        position = 12,
        length = 4
    )
    public final Builder afx(float afx) {
      this.afx = afx;
      return this;
    }

    /**
     * Y acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N 
     */
    @MavlinkMessageField(
        position = 13,
        length = 4
    )
    public final Builder afy(float afy) {
      this.afy = afy;
      return this;
    }

    /**
     * Z acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N 
     */
    @MavlinkMessageField(
        position = 14,
        length = 4
    )
    public final Builder afz(float afz) {
      this.afz = afz;
      return this;
    }

    /**
     * yaw setpoint in rad 
     */
    @MavlinkMessageField(
        position = 15,
        length = 4
    )
    public final Builder yaw(float yaw) {
      this.yaw = yaw;
      return this;
    }

    /**
     * yaw rate setpoint in rad/s 
     */
    @MavlinkMessageField(
        position = 16,
        length = 4
    )
    public final Builder yawRate(float yawRate) {
      this.yawRate = yawRate;
      return this;
    }

    public final SetPositionTargetGlobalInt build() {
      return new SetPositionTargetGlobalInt(timeBootMs, targetSystem, targetComponent, coordinateFrame, typeMask, latInt, lonInt, alt, vx, vy, vz, afx, afy, afz, yaw, yawRate);
    }
  }
}
