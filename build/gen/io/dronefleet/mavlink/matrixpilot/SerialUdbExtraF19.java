package io.dronefleet.mavlink.matrixpilot;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;

/**
 * Backwards compatible version of SERIAL_UDB_EXTRA F19 format 
 */
@MavlinkMessage(
    id = 185,
    crc = 87
)
public final class SerialUdbExtraF19 {
  private final int sueAileronOutputChannel;

  private final int sueAileronReversed;

  private final int sueElevatorOutputChannel;

  private final int sueElevatorReversed;

  private final int sueThrottleOutputChannel;

  private final int sueThrottleReversed;

  private final int sueRudderOutputChannel;

  private final int sueRudderReversed;

  private SerialUdbExtraF19(int sueAileronOutputChannel, int sueAileronReversed,
      int sueElevatorOutputChannel, int sueElevatorReversed, int sueThrottleOutputChannel,
      int sueThrottleReversed, int sueRudderOutputChannel, int sueRudderReversed) {
    this.sueAileronOutputChannel = sueAileronOutputChannel;
    this.sueAileronReversed = sueAileronReversed;
    this.sueElevatorOutputChannel = sueElevatorOutputChannel;
    this.sueElevatorReversed = sueElevatorReversed;
    this.sueThrottleOutputChannel = sueThrottleOutputChannel;
    this.sueThrottleReversed = sueThrottleReversed;
    this.sueRudderOutputChannel = sueRudderOutputChannel;
    this.sueRudderReversed = sueRudderReversed;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * SUE aileron output channel 
   */
  @MavlinkMessageField(
      position = 1,
      length = 1
  )
  public final int sueAileronOutputChannel() {
    return sueAileronOutputChannel;
  }

  /**
   * SUE aileron reversed 
   */
  @MavlinkMessageField(
      position = 2,
      length = 1
  )
  public final int sueAileronReversed() {
    return sueAileronReversed;
  }

  /**
   * SUE elevator output channel 
   */
  @MavlinkMessageField(
      position = 3,
      length = 1
  )
  public final int sueElevatorOutputChannel() {
    return sueElevatorOutputChannel;
  }

  /**
   * SUE elevator reversed 
   */
  @MavlinkMessageField(
      position = 4,
      length = 1
  )
  public final int sueElevatorReversed() {
    return sueElevatorReversed;
  }

  /**
   * SUE throttle output channel 
   */
  @MavlinkMessageField(
      position = 5,
      length = 1
  )
  public final int sueThrottleOutputChannel() {
    return sueThrottleOutputChannel;
  }

  /**
   * SUE throttle reversed 
   */
  @MavlinkMessageField(
      position = 6,
      length = 1
  )
  public final int sueThrottleReversed() {
    return sueThrottleReversed;
  }

  /**
   * SUE rudder output channel 
   */
  @MavlinkMessageField(
      position = 7,
      length = 1
  )
  public final int sueRudderOutputChannel() {
    return sueRudderOutputChannel;
  }

  /**
   * SUE rudder reversed 
   */
  @MavlinkMessageField(
      position = 8,
      length = 1
  )
  public final int sueRudderReversed() {
    return sueRudderReversed;
  }

  public class Builder {
    private int sueAileronOutputChannel;

    private int sueAileronReversed;

    private int sueElevatorOutputChannel;

    private int sueElevatorReversed;

    private int sueThrottleOutputChannel;

    private int sueThrottleReversed;

    private int sueRudderOutputChannel;

    private int sueRudderReversed;

    private Builder() {
    }

    /**
     * SUE aileron output channel 
     */
    @MavlinkMessageField(
        position = 1,
        length = 1
    )
    public final Builder sueAileronOutputChannel(int sueAileronOutputChannel) {
      this.sueAileronOutputChannel = sueAileronOutputChannel;
      return this;
    }

    /**
     * SUE aileron reversed 
     */
    @MavlinkMessageField(
        position = 2,
        length = 1
    )
    public final Builder sueAileronReversed(int sueAileronReversed) {
      this.sueAileronReversed = sueAileronReversed;
      return this;
    }

    /**
     * SUE elevator output channel 
     */
    @MavlinkMessageField(
        position = 3,
        length = 1
    )
    public final Builder sueElevatorOutputChannel(int sueElevatorOutputChannel) {
      this.sueElevatorOutputChannel = sueElevatorOutputChannel;
      return this;
    }

    /**
     * SUE elevator reversed 
     */
    @MavlinkMessageField(
        position = 4,
        length = 1
    )
    public final Builder sueElevatorReversed(int sueElevatorReversed) {
      this.sueElevatorReversed = sueElevatorReversed;
      return this;
    }

    /**
     * SUE throttle output channel 
     */
    @MavlinkMessageField(
        position = 5,
        length = 1
    )
    public final Builder sueThrottleOutputChannel(int sueThrottleOutputChannel) {
      this.sueThrottleOutputChannel = sueThrottleOutputChannel;
      return this;
    }

    /**
     * SUE throttle reversed 
     */
    @MavlinkMessageField(
        position = 6,
        length = 1
    )
    public final Builder sueThrottleReversed(int sueThrottleReversed) {
      this.sueThrottleReversed = sueThrottleReversed;
      return this;
    }

    /**
     * SUE rudder output channel 
     */
    @MavlinkMessageField(
        position = 7,
        length = 1
    )
    public final Builder sueRudderOutputChannel(int sueRudderOutputChannel) {
      this.sueRudderOutputChannel = sueRudderOutputChannel;
      return this;
    }

    /**
     * SUE rudder reversed 
     */
    @MavlinkMessageField(
        position = 8,
        length = 1
    )
    public final Builder sueRudderReversed(int sueRudderReversed) {
      this.sueRudderReversed = sueRudderReversed;
      return this;
    }

    public final SerialUdbExtraF19 build() {
      return new SerialUdbExtraF19(sueAileronOutputChannel, sueAileronReversed, sueElevatorOutputChannel, sueElevatorReversed, sueThrottleOutputChannel, sueThrottleReversed, sueRudderOutputChannel, sueRudderReversed);
    }
  }
}
