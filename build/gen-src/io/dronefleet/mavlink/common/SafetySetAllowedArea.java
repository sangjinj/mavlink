package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;

/**
 * Set a safety zone (volume), which is defined by two corners of a cube. This message can be used to 
 * tell the MAV which setpoints/waypoints to accept and which to reject. Safety areas are often 
 * enforced by national or competition regulations. 
 */
@MavlinkMessage(
    id = 54,
    crc = 15
)
public final class SafetySetAllowedArea {
  private final int targetSystem;

  private final int targetComponent;

  private final MavFrame frame;

  private final float p1x;

  private final float p1y;

  private final float p1z;

  private final float p2x;

  private final float p2y;

  private final float p2z;

  private SafetySetAllowedArea(int targetSystem, int targetComponent, MavFrame frame, float p1x,
      float p1y, float p1z, float p2x, float p2y, float p2z) {
    this.targetSystem = targetSystem;
    this.targetComponent = targetComponent;
    this.frame = frame;
    this.p1x = p1x;
    this.p1y = p1y;
    this.p1z = p1z;
    this.p2x = p2x;
    this.p2y = p2y;
    this.p2z = p2z;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * System ID 
   */
  @MavlinkMessageField(
      position = 1,
      length = 1
  )
  public final int targetSystem() {
    return targetSystem;
  }

  /**
   * Component ID 
   */
  @MavlinkMessageField(
      position = 2,
      length = 1
  )
  public final int targetComponent() {
    return targetComponent;
  }

  /**
   * Coordinate frame, as defined by MAV_FRAME enum. Can be either global, GPS, right-handed with Z 
   * axis up or local, right handed, Z axis down. 
   */
  @MavlinkMessageField(
      position = 3,
      length = 1
  )
  public final MavFrame frame() {
    return frame;
  }

  /**
   * x position 1 / Latitude 1 
   */
  @MavlinkMessageField(
      position = 4,
      length = 4
  )
  public final float p1x() {
    return p1x;
  }

  /**
   * y position 1 / Longitude 1 
   */
  @MavlinkMessageField(
      position = 5,
      length = 4
  )
  public final float p1y() {
    return p1y;
  }

  /**
   * z position 1 / Altitude 1 
   */
  @MavlinkMessageField(
      position = 6,
      length = 4
  )
  public final float p1z() {
    return p1z;
  }

  /**
   * x position 2 / Latitude 2 
   */
  @MavlinkMessageField(
      position = 7,
      length = 4
  )
  public final float p2x() {
    return p2x;
  }

  /**
   * y position 2 / Longitude 2 
   */
  @MavlinkMessageField(
      position = 8,
      length = 4
  )
  public final float p2y() {
    return p2y;
  }

  /**
   * z position 2 / Altitude 2 
   */
  @MavlinkMessageField(
      position = 9,
      length = 4
  )
  public final float p2z() {
    return p2z;
  }

  public class Builder {
    private int targetSystem;

    private int targetComponent;

    private MavFrame frame;

    private float p1x;

    private float p1y;

    private float p1z;

    private float p2x;

    private float p2y;

    private float p2z;

    private Builder() {
    }

    /**
     * System ID 
     */
    @MavlinkMessageField(
        position = 1,
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
        position = 2,
        length = 1
    )
    public final Builder targetComponent(int targetComponent) {
      this.targetComponent = targetComponent;
      return this;
    }

    /**
     * Coordinate frame, as defined by MAV_FRAME enum. Can be either global, GPS, right-handed with Z 
     * axis up or local, right handed, Z axis down. 
     */
    @MavlinkMessageField(
        position = 3,
        length = 1
    )
    public final Builder frame(MavFrame frame) {
      this.frame = frame;
      return this;
    }

    /**
     * x position 1 / Latitude 1 
     */
    @MavlinkMessageField(
        position = 4,
        length = 4
    )
    public final Builder p1x(float p1x) {
      this.p1x = p1x;
      return this;
    }

    /**
     * y position 1 / Longitude 1 
     */
    @MavlinkMessageField(
        position = 5,
        length = 4
    )
    public final Builder p1y(float p1y) {
      this.p1y = p1y;
      return this;
    }

    /**
     * z position 1 / Altitude 1 
     */
    @MavlinkMessageField(
        position = 6,
        length = 4
    )
    public final Builder p1z(float p1z) {
      this.p1z = p1z;
      return this;
    }

    /**
     * x position 2 / Latitude 2 
     */
    @MavlinkMessageField(
        position = 7,
        length = 4
    )
    public final Builder p2x(float p2x) {
      this.p2x = p2x;
      return this;
    }

    /**
     * y position 2 / Longitude 2 
     */
    @MavlinkMessageField(
        position = 8,
        length = 4
    )
    public final Builder p2y(float p2y) {
      this.p2y = p2y;
      return this;
    }

    /**
     * z position 2 / Altitude 2 
     */
    @MavlinkMessageField(
        position = 9,
        length = 4
    )
    public final Builder p2z(float p2z) {
      this.p2z = p2z;
      return this;
    }

    public final SafetySetAllowedArea build() {
      return new SafetySetAllowedArea(targetSystem, targetComponent, frame, p1x, p1y, p1z, p2x, p2y, p2z);
    }
  }
}
