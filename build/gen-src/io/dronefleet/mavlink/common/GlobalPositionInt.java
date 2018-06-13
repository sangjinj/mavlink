package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;

/**
 * The filtered global position (e.g. fused GPS and accelerometers). The position is in 
 * GPS-frame (right-handed, Z-up). It is designed as scaled integer message since the 
 * resolution of float is not sufficient. 
 */
@MavlinkMessage(
    id = 33,
    crc = 104
)
public final class GlobalPositionInt {
  private final long timeBootMs;

  private final int lat;

  private final int lon;

  private final int alt;

  private final int relativeAlt;

  private final int vx;

  private final int vy;

  private final int vz;

  private final int hdg;

  private GlobalPositionInt(long timeBootMs, int lat, int lon, int alt, int relativeAlt, int vx,
      int vy, int vz, int hdg) {
    this.timeBootMs = timeBootMs;
    this.lat = lat;
    this.lon = lon;
    this.alt = alt;
    this.relativeAlt = relativeAlt;
    this.vx = vx;
    this.vy = vy;
    this.vz = vz;
    this.hdg = hdg;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Timestamp (milliseconds since system boot) 
   */
  @MavlinkMessageField(
      position = 1,
      length = 4
  )
  public final long timeBootMs() {
    return timeBootMs;
  }

  /**
   * Latitude, expressed as degrees * 1E7 
   */
  @MavlinkMessageField(
      position = 2,
      length = 4
  )
  public final int lat() {
    return lat;
  }

  /**
   * Longitude, expressed as degrees * 1E7 
   */
  @MavlinkMessageField(
      position = 3,
      length = 4
  )
  public final int lon() {
    return lon;
  }

  /**
   * Altitude in meters, expressed as * 1000 (millimeters), AMSL (not WGS84 - note that virtually 
   * all GPS modules provide the AMSL as well) 
   */
  @MavlinkMessageField(
      position = 4,
      length = 4
  )
  public final int alt() {
    return alt;
  }

  /**
   * Altitude above ground in meters, expressed as * 1000 (millimeters) 
   */
  @MavlinkMessageField(
      position = 5,
      length = 4
  )
  public final int relativeAlt() {
    return relativeAlt;
  }

  /**
   * Ground X Speed (Latitude, positive north), expressed as m/s * 100 
   */
  @MavlinkMessageField(
      position = 6,
      length = 2
  )
  public final int vx() {
    return vx;
  }

  /**
   * Ground Y Speed (Longitude, positive east), expressed as m/s * 100 
   */
  @MavlinkMessageField(
      position = 7,
      length = 2
  )
  public final int vy() {
    return vy;
  }

  /**
   * Ground Z Speed (Altitude, positive down), expressed as m/s * 100 
   */
  @MavlinkMessageField(
      position = 8,
      length = 2
  )
  public final int vz() {
    return vz;
  }

  /**
   * Vehicle heading (yaw angle) in degrees * 100, 0.0..359.99 degrees. If unknown, set to: 
   * UINT16_MAX 
   */
  @MavlinkMessageField(
      position = 9,
      length = 2
  )
  public final int hdg() {
    return hdg;
  }

  public class Builder {
    private long timeBootMs;

    private int lat;

    private int lon;

    private int alt;

    private int relativeAlt;

    private int vx;

    private int vy;

    private int vz;

    private int hdg;

    private Builder() {
    }

    /**
     * Timestamp (milliseconds since system boot) 
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
     * Latitude, expressed as degrees * 1E7 
     */
    @MavlinkMessageField(
        position = 2,
        length = 4
    )
    public final Builder lat(int lat) {
      this.lat = lat;
      return this;
    }

    /**
     * Longitude, expressed as degrees * 1E7 
     */
    @MavlinkMessageField(
        position = 3,
        length = 4
    )
    public final Builder lon(int lon) {
      this.lon = lon;
      return this;
    }

    /**
     * Altitude in meters, expressed as * 1000 (millimeters), AMSL (not WGS84 - note that virtually 
     * all GPS modules provide the AMSL as well) 
     */
    @MavlinkMessageField(
        position = 4,
        length = 4
    )
    public final Builder alt(int alt) {
      this.alt = alt;
      return this;
    }

    /**
     * Altitude above ground in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkMessageField(
        position = 5,
        length = 4
    )
    public final Builder relativeAlt(int relativeAlt) {
      this.relativeAlt = relativeAlt;
      return this;
    }

    /**
     * Ground X Speed (Latitude, positive north), expressed as m/s * 100 
     */
    @MavlinkMessageField(
        position = 6,
        length = 2
    )
    public final Builder vx(int vx) {
      this.vx = vx;
      return this;
    }

    /**
     * Ground Y Speed (Longitude, positive east), expressed as m/s * 100 
     */
    @MavlinkMessageField(
        position = 7,
        length = 2
    )
    public final Builder vy(int vy) {
      this.vy = vy;
      return this;
    }

    /**
     * Ground Z Speed (Altitude, positive down), expressed as m/s * 100 
     */
    @MavlinkMessageField(
        position = 8,
        length = 2
    )
    public final Builder vz(int vz) {
      this.vz = vz;
      return this;
    }

    /**
     * Vehicle heading (yaw angle) in degrees * 100, 0.0..359.99 degrees. If unknown, set to: 
     * UINT16_MAX 
     */
    @MavlinkMessageField(
        position = 9,
        length = 2
    )
    public final Builder hdg(int hdg) {
      this.hdg = hdg;
      return this;
    }

    public final GlobalPositionInt build() {
      return new GlobalPositionInt(timeBootMs, lat, lon, alt, relativeAlt, vx, vy, vz, hdg);
    }
  }
}
