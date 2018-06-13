package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;
import java.math.BigInteger;

/**
 * Sent from simulation to autopilot. The RAW values of the RC channels received. The standard PPM 
 * modulation is as follows: 1000 microseconds: 0%, 2000 microseconds: 100%. Individual 
 * receivers/transmitters might violate this specification. 
 */
@MavlinkMessage(
    id = 92,
    crc = 54
)
public final class HilRcInputsRaw {
  /**
   * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
   */
  private final BigInteger timeUsec;

  /**
   * RC channel 1 value, in microseconds 
   */
  private final int chan1Raw;

  /**
   * RC channel 2 value, in microseconds 
   */
  private final int chan2Raw;

  /**
   * RC channel 3 value, in microseconds 
   */
  private final int chan3Raw;

  /**
   * RC channel 4 value, in microseconds 
   */
  private final int chan4Raw;

  /**
   * RC channel 5 value, in microseconds 
   */
  private final int chan5Raw;

  /**
   * RC channel 6 value, in microseconds 
   */
  private final int chan6Raw;

  /**
   * RC channel 7 value, in microseconds 
   */
  private final int chan7Raw;

  /**
   * RC channel 8 value, in microseconds 
   */
  private final int chan8Raw;

  /**
   * RC channel 9 value, in microseconds 
   */
  private final int chan9Raw;

  /**
   * RC channel 10 value, in microseconds 
   */
  private final int chan10Raw;

  /**
   * RC channel 11 value, in microseconds 
   */
  private final int chan11Raw;

  /**
   * RC channel 12 value, in microseconds 
   */
  private final int chan12Raw;

  /**
   * Receive signal strength indicator, 0: 0%, 255: 100% 
   */
  private final int rssi;

  private HilRcInputsRaw(BigInteger timeUsec, int chan1Raw, int chan2Raw, int chan3Raw,
      int chan4Raw, int chan5Raw, int chan6Raw, int chan7Raw, int chan8Raw, int chan9Raw,
      int chan10Raw, int chan11Raw, int chan12Raw, int rssi) {
    this.timeUsec = timeUsec;
    this.chan1Raw = chan1Raw;
    this.chan2Raw = chan2Raw;
    this.chan3Raw = chan3Raw;
    this.chan4Raw = chan4Raw;
    this.chan5Raw = chan5Raw;
    this.chan6Raw = chan6Raw;
    this.chan7Raw = chan7Raw;
    this.chan8Raw = chan8Raw;
    this.chan9Raw = chan9Raw;
    this.chan10Raw = chan10Raw;
    this.chan11Raw = chan11Raw;
    this.chan12Raw = chan12Raw;
    this.rssi = rssi;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
   */
  @MavlinkMessageField(
      position = 1,
      length = 8
  )
  public final BigInteger timeUsec() {
    return timeUsec;
  }

  /**
   * RC channel 1 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 2,
      length = 2
  )
  public final int chan1Raw() {
    return chan1Raw;
  }

  /**
   * RC channel 2 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 3,
      length = 2
  )
  public final int chan2Raw() {
    return chan2Raw;
  }

  /**
   * RC channel 3 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 4,
      length = 2
  )
  public final int chan3Raw() {
    return chan3Raw;
  }

  /**
   * RC channel 4 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 5,
      length = 2
  )
  public final int chan4Raw() {
    return chan4Raw;
  }

  /**
   * RC channel 5 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 6,
      length = 2
  )
  public final int chan5Raw() {
    return chan5Raw;
  }

  /**
   * RC channel 6 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 7,
      length = 2
  )
  public final int chan6Raw() {
    return chan6Raw;
  }

  /**
   * RC channel 7 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 8,
      length = 2
  )
  public final int chan7Raw() {
    return chan7Raw;
  }

  /**
   * RC channel 8 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 9,
      length = 2
  )
  public final int chan8Raw() {
    return chan8Raw;
  }

  /**
   * RC channel 9 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 10,
      length = 2
  )
  public final int chan9Raw() {
    return chan9Raw;
  }

  /**
   * RC channel 10 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 11,
      length = 2
  )
  public final int chan10Raw() {
    return chan10Raw;
  }

  /**
   * RC channel 11 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 12,
      length = 2
  )
  public final int chan11Raw() {
    return chan11Raw;
  }

  /**
   * RC channel 12 value, in microseconds 
   */
  @MavlinkMessageField(
      position = 13,
      length = 2
  )
  public final int chan12Raw() {
    return chan12Raw;
  }

  /**
   * Receive signal strength indicator, 0: 0%, 255: 100% 
   */
  @MavlinkMessageField(
      position = 14,
      length = 1
  )
  public final int rssi() {
    return rssi;
  }

  public static class Builder {
    private BigInteger timeUsec;

    private int chan1Raw;

    private int chan2Raw;

    private int chan3Raw;

    private int chan4Raw;

    private int chan5Raw;

    private int chan6Raw;

    private int chan7Raw;

    private int chan8Raw;

    private int chan9Raw;

    private int chan10Raw;

    private int chan11Raw;

    private int chan12Raw;

    private int rssi;

    private Builder() {
    }

    /**
     * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
     */
    @MavlinkMessageField(
        position = 1,
        length = 8
    )
    public final Builder timeUsec(BigInteger timeUsec) {
      this.timeUsec = timeUsec;
      return this;
    }

    /**
     * RC channel 1 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 2,
        length = 2
    )
    public final Builder chan1Raw(int chan1Raw) {
      this.chan1Raw = chan1Raw;
      return this;
    }

    /**
     * RC channel 2 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 3,
        length = 2
    )
    public final Builder chan2Raw(int chan2Raw) {
      this.chan2Raw = chan2Raw;
      return this;
    }

    /**
     * RC channel 3 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 4,
        length = 2
    )
    public final Builder chan3Raw(int chan3Raw) {
      this.chan3Raw = chan3Raw;
      return this;
    }

    /**
     * RC channel 4 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 5,
        length = 2
    )
    public final Builder chan4Raw(int chan4Raw) {
      this.chan4Raw = chan4Raw;
      return this;
    }

    /**
     * RC channel 5 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 6,
        length = 2
    )
    public final Builder chan5Raw(int chan5Raw) {
      this.chan5Raw = chan5Raw;
      return this;
    }

    /**
     * RC channel 6 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 7,
        length = 2
    )
    public final Builder chan6Raw(int chan6Raw) {
      this.chan6Raw = chan6Raw;
      return this;
    }

    /**
     * RC channel 7 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 8,
        length = 2
    )
    public final Builder chan7Raw(int chan7Raw) {
      this.chan7Raw = chan7Raw;
      return this;
    }

    /**
     * RC channel 8 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 9,
        length = 2
    )
    public final Builder chan8Raw(int chan8Raw) {
      this.chan8Raw = chan8Raw;
      return this;
    }

    /**
     * RC channel 9 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 10,
        length = 2
    )
    public final Builder chan9Raw(int chan9Raw) {
      this.chan9Raw = chan9Raw;
      return this;
    }

    /**
     * RC channel 10 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 11,
        length = 2
    )
    public final Builder chan10Raw(int chan10Raw) {
      this.chan10Raw = chan10Raw;
      return this;
    }

    /**
     * RC channel 11 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 12,
        length = 2
    )
    public final Builder chan11Raw(int chan11Raw) {
      this.chan11Raw = chan11Raw;
      return this;
    }

    /**
     * RC channel 12 value, in microseconds 
     */
    @MavlinkMessageField(
        position = 13,
        length = 2
    )
    public final Builder chan12Raw(int chan12Raw) {
      this.chan12Raw = chan12Raw;
      return this;
    }

    /**
     * Receive signal strength indicator, 0: 0%, 255: 100% 
     */
    @MavlinkMessageField(
        position = 14,
        length = 1
    )
    public final Builder rssi(int rssi) {
      this.rssi = rssi;
      return this;
    }

    public final HilRcInputsRaw build() {
      return new HilRcInputsRaw(timeUsec, chan1Raw, chan2Raw, chan3Raw, chan4Raw, chan5Raw, chan6Raw, chan7Raw, chan8Raw, chan9Raw, chan10Raw, chan11Raw, chan12Raw, rssi);
    }
  }
}
