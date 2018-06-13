package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;
import java.math.BigInteger;

/**
 * Once the MAV sets a new GPS-Local correspondence, this message announces the origin (0,0,0) 
 * position 
 */
@MavlinkMessage(
    id = 49,
    crc = 39
)
public final class GpsGlobalOrigin {
  private final int latitude;

  private final int longitude;

  private final int altitude;

  private final BigInteger timeUsec;

  private GpsGlobalOrigin(int latitude, int longitude, int altitude, BigInteger timeUsec) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.altitude = altitude;
    this.timeUsec = timeUsec;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Latitude (WGS84), in degrees * 1E7 
   */
  @MavlinkMessageField(
      position = 1,
      length = 4
  )
  public final int latitude() {
    return latitude;
  }

  /**
   * Longitude (WGS84), in degrees * 1E7 
   */
  @MavlinkMessageField(
      position = 2,
      length = 4
  )
  public final int longitude() {
    return longitude;
  }

  /**
   * Altitude (AMSL), in meters * 1000 (positive for up) 
   */
  @MavlinkMessageField(
      position = 3,
      length = 4
  )
  public final int altitude() {
    return altitude;
  }

  /**
   * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
   */
  @MavlinkMessageField(
      position = 5,
      length = 8,
      extension = true
  )
  public final BigInteger timeUsec() {
    return timeUsec;
  }

  public class Builder {
    private int latitude;

    private int longitude;

    private int altitude;

    private BigInteger timeUsec;

    private Builder() {
    }

    /**
     * Latitude (WGS84), in degrees * 1E7 
     */
    @MavlinkMessageField(
        position = 1,
        length = 4
    )
    public final Builder latitude(int latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * Longitude (WGS84), in degrees * 1E7 
     */
    @MavlinkMessageField(
        position = 2,
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
        position = 3,
        length = 4
    )
    public final Builder altitude(int altitude) {
      this.altitude = altitude;
      return this;
    }

    /**
     * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
     */
    @MavlinkMessageField(
        position = 5,
        length = 8,
        extension = true
    )
    public final Builder timeUsec(BigInteger timeUsec) {
      this.timeUsec = timeUsec;
      return this;
    }

    public final GpsGlobalOrigin build() {
      return new GpsGlobalOrigin(latitude, longitude, altitude, timeUsec);
    }
  }
}
