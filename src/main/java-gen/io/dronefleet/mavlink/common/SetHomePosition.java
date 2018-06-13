package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;
import java.lang.Float;
import java.math.BigInteger;
import java.util.List;

/**
 * The position the system will return to and land on. The position is set automatically by the 
 * system during the takeoff in case it was not explicitely set by the operator before or after. The 
 * global and local positions encode the position in the respective coordinate frames, while the 
 * q parameter encodes the orientation of the surface. Under normal conditions it describes the 
 * heading and terrain slope, which can be used by the aircraft to adjust the approach. The 
 * approach 3D vector describes the point to which the system should fly in normal flight mode and 
 * then perform a landing sequence along the vector. 
 */
@MavlinkMessage(
    id = 243,
    crc = 85
)
public final class SetHomePosition {
  /**
   * System ID. 
   */
  private final int targetSystem;

  /**
   * Latitude (WGS84), in degrees * 1E7 
   */
  private final int latitude;

  /**
   * Longitude (WGS84, in degrees * 1E7 
   */
  private final int longitude;

  /**
   * Altitude (AMSL), in meters * 1000 (positive for up) 
   */
  private final int altitude;

  /**
   * Local X position of this position in the local coordinate frame 
   */
  private final float x;

  /**
   * Local Y position of this position in the local coordinate frame 
   */
  private final float y;

  /**
   * Local Z position of this position in the local coordinate frame 
   */
  private final float z;

  /**
   * World to surface normal and heading transformation of the takeoff position. Used to indicate 
   * the heading and slope of the ground 
   */
  private final List<Float> q;

  /**
   * Local X position of the end of the approach vector. Multicopters should set this position based 
   * on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as 
   * multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of 
   * the takeoff, assuming the takeoff happened from the threshold / touchdown zone. 
   */
  private final float approachX;

  /**
   * Local Y position of the end of the approach vector. Multicopters should set this position based 
   * on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as 
   * multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of 
   * the takeoff, assuming the takeoff happened from the threshold / touchdown zone. 
   */
  private final float approachY;

  /**
   * Local Z position of the end of the approach vector. Multicopters should set this position based 
   * on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as 
   * multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of 
   * the takeoff, assuming the takeoff happened from the threshold / touchdown zone. 
   */
  private final float approachZ;

  /**
   * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
   */
  private final BigInteger timeUsec;

  private SetHomePosition(int targetSystem, int latitude, int longitude, int altitude, float x,
      float y, float z, List<Float> q, float approachX, float approachY, float approachZ,
      BigInteger timeUsec) {
    this.targetSystem = targetSystem;
    this.latitude = latitude;
    this.longitude = longitude;
    this.altitude = altitude;
    this.x = x;
    this.y = y;
    this.z = z;
    this.q = q;
    this.approachX = approachX;
    this.approachY = approachY;
    this.approachZ = approachZ;
    this.timeUsec = timeUsec;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * System ID. 
   */
  @MavlinkMessageField(
      position = 1,
      length = 1
  )
  public final int targetSystem() {
    return targetSystem;
  }

  /**
   * Latitude (WGS84), in degrees * 1E7 
   */
  @MavlinkMessageField(
      position = 2,
      length = 4
  )
  public final int latitude() {
    return latitude;
  }

  /**
   * Longitude (WGS84, in degrees * 1E7 
   */
  @MavlinkMessageField(
      position = 3,
      length = 4
  )
  public final int longitude() {
    return longitude;
  }

  /**
   * Altitude (AMSL), in meters * 1000 (positive for up) 
   */
  @MavlinkMessageField(
      position = 4,
      length = 4
  )
  public final int altitude() {
    return altitude;
  }

  /**
   * Local X position of this position in the local coordinate frame 
   */
  @MavlinkMessageField(
      position = 5,
      length = 4
  )
  public final float x() {
    return x;
  }

  /**
   * Local Y position of this position in the local coordinate frame 
   */
  @MavlinkMessageField(
      position = 6,
      length = 4
  )
  public final float y() {
    return y;
  }

  /**
   * Local Z position of this position in the local coordinate frame 
   */
  @MavlinkMessageField(
      position = 7,
      length = 4
  )
  public final float z() {
    return z;
  }

  /**
   * World to surface normal and heading transformation of the takeoff position. Used to indicate 
   * the heading and slope of the ground 
   */
  @MavlinkMessageField(
      position = 8,
      length = 4,
      arraySize = 4
  )
  public final List<Float> q() {
    return q;
  }

  /**
   * Local X position of the end of the approach vector. Multicopters should set this position based 
   * on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as 
   * multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of 
   * the takeoff, assuming the takeoff happened from the threshold / touchdown zone. 
   */
  @MavlinkMessageField(
      position = 9,
      length = 4
  )
  public final float approachX() {
    return approachX;
  }

  /**
   * Local Y position of the end of the approach vector. Multicopters should set this position based 
   * on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as 
   * multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of 
   * the takeoff, assuming the takeoff happened from the threshold / touchdown zone. 
   */
  @MavlinkMessageField(
      position = 10,
      length = 4
  )
  public final float approachY() {
    return approachY;
  }

  /**
   * Local Z position of the end of the approach vector. Multicopters should set this position based 
   * on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as 
   * multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of 
   * the takeoff, assuming the takeoff happened from the threshold / touchdown zone. 
   */
  @MavlinkMessageField(
      position = 11,
      length = 4
  )
  public final float approachZ() {
    return approachZ;
  }

  /**
   * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
   */
  @MavlinkMessageField(
      position = 13,
      length = 8,
      extension = true
  )
  public final BigInteger timeUsec() {
    return timeUsec;
  }

  public static class Builder {
    private int targetSystem;

    private int latitude;

    private int longitude;

    private int altitude;

    private float x;

    private float y;

    private float z;

    private List<Float> q;

    private float approachX;

    private float approachY;

    private float approachZ;

    private BigInteger timeUsec;

    private Builder() {
    }

    /**
     * System ID. 
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
     * Latitude (WGS84), in degrees * 1E7 
     */
    @MavlinkMessageField(
        position = 2,
        length = 4
    )
    public final Builder latitude(int latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * Longitude (WGS84, in degrees * 1E7 
     */
    @MavlinkMessageField(
        position = 3,
        length = 4
    )
    public final Builder longitude(int longitude) {
      this.longitude = longitude;
      return this;
    }

    /**
     * Altitude (AMSL), in meters * 1000 (positive for up) 
     */
    @MavlinkMessageField(
        position = 4,
        length = 4
    )
    public final Builder altitude(int altitude) {
      this.altitude = altitude;
      return this;
    }

    /**
     * Local X position of this position in the local coordinate frame 
     */
    @MavlinkMessageField(
        position = 5,
        length = 4
    )
    public final Builder x(float x) {
      this.x = x;
      return this;
    }

    /**
     * Local Y position of this position in the local coordinate frame 
     */
    @MavlinkMessageField(
        position = 6,
        length = 4
    )
    public final Builder y(float y) {
      this.y = y;
      return this;
    }

    /**
     * Local Z position of this position in the local coordinate frame 
     */
    @MavlinkMessageField(
        position = 7,
        length = 4
    )
    public final Builder z(float z) {
      this.z = z;
      return this;
    }

    /**
     * World to surface normal and heading transformation of the takeoff position. Used to indicate 
     * the heading and slope of the ground 
     */
    @MavlinkMessageField(
        position = 8,
        length = 4,
        arraySize = 4
    )
    public final Builder q(List<Float> q) {
      this.q = q;
      return this;
    }

    /**
     * Local X position of the end of the approach vector. Multicopters should set this position based 
     * on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as 
     * multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of 
     * the takeoff, assuming the takeoff happened from the threshold / touchdown zone. 
     */
    @MavlinkMessageField(
        position = 9,
        length = 4
    )
    public final Builder approachX(float approachX) {
      this.approachX = approachX;
      return this;
    }

    /**
     * Local Y position of the end of the approach vector. Multicopters should set this position based 
     * on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as 
     * multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of 
     * the takeoff, assuming the takeoff happened from the threshold / touchdown zone. 
     */
    @MavlinkMessageField(
        position = 10,
        length = 4
    )
    public final Builder approachY(float approachY) {
      this.approachY = approachY;
      return this;
    }

    /**
     * Local Z position of the end of the approach vector. Multicopters should set this position based 
     * on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as 
     * multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of 
     * the takeoff, assuming the takeoff happened from the threshold / touchdown zone. 
     */
    @MavlinkMessageField(
        position = 11,
        length = 4
    )
    public final Builder approachZ(float approachZ) {
      this.approachZ = approachZ;
      return this;
    }

    /**
     * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
     */
    @MavlinkMessageField(
        position = 13,
        length = 8,
        extension = true
    )
    public final Builder timeUsec(BigInteger timeUsec) {
      this.timeUsec = timeUsec;
      return this;
    }

    public final SetHomePosition build() {
      return new SetHomePosition(targetSystem, latitude, longitude, altitude, x, y, z, q, approachX, approachY, approachZ, timeUsec);
    }
  }
}