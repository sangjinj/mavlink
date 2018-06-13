package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;

/**
 * RPM sensor output 
 */
@MavlinkMessage(
    id = 226,
    crc = 207
)
public final class Rpm {
  private final float rpm1;

  private final float rpm2;

  private Rpm(float rpm1, float rpm2) {
    this.rpm1 = rpm1;
    this.rpm2 = rpm2;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * RPM Sensor1 
   */
  @MavlinkMessageField(
      position = 1,
      length = 4
  )
  public final float rpm1() {
    return rpm1;
  }

  /**
   * RPM Sensor2 
   */
  @MavlinkMessageField(
      position = 2,
      length = 4
  )
  public final float rpm2() {
    return rpm2;
  }

  public class Builder {
    private float rpm1;

    private float rpm2;

    private Builder() {
    }

    /**
     * RPM Sensor1 
     */
    @MavlinkMessageField(
        position = 1,
        length = 4
    )
    public final Builder rpm1(float rpm1) {
      this.rpm1 = rpm1;
      return this;
    }

    /**
     * RPM Sensor2 
     */
    @MavlinkMessageField(
        position = 2,
        length = 4
    )
    public final Builder rpm2(float rpm2) {
      this.rpm2 = rpm2;
      return this;
    }

    public final Rpm build() {
      return new Rpm(rpm1, rpm2);
    }
  }
}
