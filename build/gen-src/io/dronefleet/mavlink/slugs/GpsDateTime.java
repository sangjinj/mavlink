package io.dronefleet.mavlink.slugs;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;

/**
 * Pilot console PWM messges. 
 */
@MavlinkMessage(
    id = 179,
    crc = 132
)
public final class GpsDateTime {
  private final int year;

  private final int month;

  private final int day;

  private final int hour;

  private final int min;

  private final int sec;

  private final int clockstat;

  private final int vissat;

  private final int usesat;

  private final int gppgl;

  private final int sigusedmask;

  private final int percentused;

  private GpsDateTime(int year, int month, int day, int hour, int min, int sec, int clockstat,
      int vissat, int usesat, int gppgl, int sigusedmask, int percentused) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.hour = hour;
    this.min = min;
    this.sec = sec;
    this.clockstat = clockstat;
    this.vissat = vissat;
    this.usesat = usesat;
    this.gppgl = gppgl;
    this.sigusedmask = sigusedmask;
    this.percentused = percentused;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Year reported by Gps 
   */
  @MavlinkMessageField(
      position = 1,
      length = 1
  )
  public final int year() {
    return year;
  }

  /**
   * Month reported by Gps 
   */
  @MavlinkMessageField(
      position = 2,
      length = 1
  )
  public final int month() {
    return month;
  }

  /**
   * Day reported by Gps 
   */
  @MavlinkMessageField(
      position = 3,
      length = 1
  )
  public final int day() {
    return day;
  }

  /**
   * Hour reported by Gps 
   */
  @MavlinkMessageField(
      position = 4,
      length = 1
  )
  public final int hour() {
    return hour;
  }

  /**
   * Min reported by Gps 
   */
  @MavlinkMessageField(
      position = 5,
      length = 1
  )
  public final int min() {
    return min;
  }

  /**
   * Sec reported by Gps 
   */
  @MavlinkMessageField(
      position = 6,
      length = 1
  )
  public final int sec() {
    return sec;
  }

  /**
   * Clock Status. See table 47 page 211 OEMStar Manual 
   */
  @MavlinkMessageField(
      position = 7,
      length = 1
  )
  public final int clockstat() {
    return clockstat;
  }

  /**
   * Visible satellites reported by Gps 
   */
  @MavlinkMessageField(
      position = 8,
      length = 1
  )
  public final int vissat() {
    return vissat;
  }

  /**
   * Used satellites in Solution 
   */
  @MavlinkMessageField(
      position = 9,
      length = 1
  )
  public final int usesat() {
    return usesat;
  }

  /**
   * GPS+GLONASS satellites in Solution 
   */
  @MavlinkMessageField(
      position = 10,
      length = 1
  )
  public final int gppgl() {
    return gppgl;
  }

  /**
   * GPS and GLONASS usage mask (bit 0 GPS_used? bit_4 GLONASS_used?) 
   */
  @MavlinkMessageField(
      position = 11,
      length = 1
  )
  public final int sigusedmask() {
    return sigusedmask;
  }

  /**
   * Percent used GPS 
   */
  @MavlinkMessageField(
      position = 12,
      length = 1
  )
  public final int percentused() {
    return percentused;
  }

  public class Builder {
    private int year;

    private int month;

    private int day;

    private int hour;

    private int min;

    private int sec;

    private int clockstat;

    private int vissat;

    private int usesat;

    private int gppgl;

    private int sigusedmask;

    private int percentused;

    private Builder() {
    }

    /**
     * Year reported by Gps 
     */
    @MavlinkMessageField(
        position = 1,
        length = 1
    )
    public final Builder year(int year) {
      this.year = year;
      return this;
    }

    /**
     * Month reported by Gps 
     */
    @MavlinkMessageField(
        position = 2,
        length = 1
    )
    public final Builder month(int month) {
      this.month = month;
      return this;
    }

    /**
     * Day reported by Gps 
     */
    @MavlinkMessageField(
        position = 3,
        length = 1
    )
    public final Builder day(int day) {
      this.day = day;
      return this;
    }

    /**
     * Hour reported by Gps 
     */
    @MavlinkMessageField(
        position = 4,
        length = 1
    )
    public final Builder hour(int hour) {
      this.hour = hour;
      return this;
    }

    /**
     * Min reported by Gps 
     */
    @MavlinkMessageField(
        position = 5,
        length = 1
    )
    public final Builder min(int min) {
      this.min = min;
      return this;
    }

    /**
     * Sec reported by Gps 
     */
    @MavlinkMessageField(
        position = 6,
        length = 1
    )
    public final Builder sec(int sec) {
      this.sec = sec;
      return this;
    }

    /**
     * Clock Status. See table 47 page 211 OEMStar Manual 
     */
    @MavlinkMessageField(
        position = 7,
        length = 1
    )
    public final Builder clockstat(int clockstat) {
      this.clockstat = clockstat;
      return this;
    }

    /**
     * Visible satellites reported by Gps 
     */
    @MavlinkMessageField(
        position = 8,
        length = 1
    )
    public final Builder vissat(int vissat) {
      this.vissat = vissat;
      return this;
    }

    /**
     * Used satellites in Solution 
     */
    @MavlinkMessageField(
        position = 9,
        length = 1
    )
    public final Builder usesat(int usesat) {
      this.usesat = usesat;
      return this;
    }

    /**
     * GPS+GLONASS satellites in Solution 
     */
    @MavlinkMessageField(
        position = 10,
        length = 1
    )
    public final Builder gppgl(int gppgl) {
      this.gppgl = gppgl;
      return this;
    }

    /**
     * GPS and GLONASS usage mask (bit 0 GPS_used? bit_4 GLONASS_used?) 
     */
    @MavlinkMessageField(
        position = 11,
        length = 1
    )
    public final Builder sigusedmask(int sigusedmask) {
      this.sigusedmask = sigusedmask;
      return this;
    }

    /**
     * Percent used GPS 
     */
    @MavlinkMessageField(
        position = 12,
        length = 1
    )
    public final Builder percentused(int percentused) {
      this.percentused = percentused;
      return this;
    }

    public final GpsDateTime build() {
      return new GpsDateTime(year, month, day, hour, min, sec, clockstat, vissat, usesat, gppgl, sigusedmask, percentused);
    }
  }
}
