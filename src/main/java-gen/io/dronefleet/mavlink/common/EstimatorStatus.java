package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;
import io.dronefleet.mavlink.util.EnumFlagSet;
import java.math.BigInteger;

/**
 * Estimator status message including flags, innovation test ratios and estimated accuracies. 
 * The flags message is an integer bitmask containing information on which EKF outputs are valid. 
 * See the {@link io.dronefleet.mavlink.common.EstimatorStatusFlags EstimatorStatusFlags} enum definition for further information. The innovaton test 
 * ratios show the magnitude of the sensor innovation divided by the innovation check threshold. 
 * Under normal operation the innovaton test ratios should be below 0.5 with occasional values up 
 * to 1.0. Values greater than 1.0 should be rare under normal operation and indicate that a 
 * measurement has been rejected by the filter. The user should be notified if an innovation test 
 * ratio greater than 1.0 is recorded. Notifications for values in the range between 0.5 and 1.0 
 * should be optional and controllable by the user. 
 */
@MavlinkMessage(
    id = 230,
    crc = 163
)
public final class EstimatorStatus {
  /**
   * Timestamp (micros since boot or Unix epoch) 
   */
  private final BigInteger timeUsec;

  /**
   * Integer bitmask indicating which EKF outputs are valid. See definition for 
   * {@link io.dronefleet.mavlink.common.EstimatorStatusFlags EstimatorStatusFlags}. 
   */
  private final EnumFlagSet<EstimatorStatusFlags> flags;

  /**
   * Velocity innovation test ratio 
   */
  private final float velRatio;

  /**
   * Horizontal position innovation test ratio 
   */
  private final float posHorizRatio;

  /**
   * Vertical position innovation test ratio 
   */
  private final float posVertRatio;

  /**
   * Magnetometer innovation test ratio 
   */
  private final float magRatio;

  /**
   * Height above terrain innovation test ratio 
   */
  private final float haglRatio;

  /**
   * True airspeed innovation test ratio 
   */
  private final float tasRatio;

  /**
   * Horizontal position 1-STD accuracy relative to the EKF local origin (m) 
   */
  private final float posHorizAccuracy;

  /**
   * Vertical position 1-STD accuracy relative to the EKF local origin (m) 
   */
  private final float posVertAccuracy;

  private EstimatorStatus(BigInteger timeUsec, EnumFlagSet<EstimatorStatusFlags> flags,
      float velRatio, float posHorizRatio, float posVertRatio, float magRatio, float haglRatio,
      float tasRatio, float posHorizAccuracy, float posVertAccuracy) {
    this.timeUsec = timeUsec;
    this.flags = flags;
    this.velRatio = velRatio;
    this.posHorizRatio = posHorizRatio;
    this.posVertRatio = posVertRatio;
    this.magRatio = magRatio;
    this.haglRatio = haglRatio;
    this.tasRatio = tasRatio;
    this.posHorizAccuracy = posHorizAccuracy;
    this.posVertAccuracy = posVertAccuracy;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Timestamp (micros since boot or Unix epoch) 
   */
  @MavlinkMessageField(
      position = 1,
      length = 8
  )
  public final BigInteger timeUsec() {
    return timeUsec;
  }

  /**
   * Integer bitmask indicating which EKF outputs are valid. See definition for 
   * {@link io.dronefleet.mavlink.common.EstimatorStatusFlags EstimatorStatusFlags}. 
   */
  @MavlinkMessageField(
      position = 2,
      length = 2
  )
  public final EnumFlagSet<EstimatorStatusFlags> flags() {
    return flags;
  }

  /**
   * Velocity innovation test ratio 
   */
  @MavlinkMessageField(
      position = 3,
      length = 4
  )
  public final float velRatio() {
    return velRatio;
  }

  /**
   * Horizontal position innovation test ratio 
   */
  @MavlinkMessageField(
      position = 4,
      length = 4
  )
  public final float posHorizRatio() {
    return posHorizRatio;
  }

  /**
   * Vertical position innovation test ratio 
   */
  @MavlinkMessageField(
      position = 5,
      length = 4
  )
  public final float posVertRatio() {
    return posVertRatio;
  }

  /**
   * Magnetometer innovation test ratio 
   */
  @MavlinkMessageField(
      position = 6,
      length = 4
  )
  public final float magRatio() {
    return magRatio;
  }

  /**
   * Height above terrain innovation test ratio 
   */
  @MavlinkMessageField(
      position = 7,
      length = 4
  )
  public final float haglRatio() {
    return haglRatio;
  }

  /**
   * True airspeed innovation test ratio 
   */
  @MavlinkMessageField(
      position = 8,
      length = 4
  )
  public final float tasRatio() {
    return tasRatio;
  }

  /**
   * Horizontal position 1-STD accuracy relative to the EKF local origin (m) 
   */
  @MavlinkMessageField(
      position = 9,
      length = 4
  )
  public final float posHorizAccuracy() {
    return posHorizAccuracy;
  }

  /**
   * Vertical position 1-STD accuracy relative to the EKF local origin (m) 
   */
  @MavlinkMessageField(
      position = 10,
      length = 4
  )
  public final float posVertAccuracy() {
    return posVertAccuracy;
  }

  public static class Builder {
    private BigInteger timeUsec;

    private EnumFlagSet<EstimatorStatusFlags> flags;

    private float velRatio;

    private float posHorizRatio;

    private float posVertRatio;

    private float magRatio;

    private float haglRatio;

    private float tasRatio;

    private float posHorizAccuracy;

    private float posVertAccuracy;

    private Builder() {
    }

    /**
     * Timestamp (micros since boot or Unix epoch) 
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
     * Integer bitmask indicating which EKF outputs are valid. See definition for 
     * {@link io.dronefleet.mavlink.common.EstimatorStatusFlags EstimatorStatusFlags}. 
     */
    @MavlinkMessageField(
        position = 2,
        length = 2
    )
    public final Builder flags(EnumFlagSet<EstimatorStatusFlags> flags) {
      this.flags = flags;
      return this;
    }

    /**
     * Velocity innovation test ratio 
     */
    @MavlinkMessageField(
        position = 3,
        length = 4
    )
    public final Builder velRatio(float velRatio) {
      this.velRatio = velRatio;
      return this;
    }

    /**
     * Horizontal position innovation test ratio 
     */
    @MavlinkMessageField(
        position = 4,
        length = 4
    )
    public final Builder posHorizRatio(float posHorizRatio) {
      this.posHorizRatio = posHorizRatio;
      return this;
    }

    /**
     * Vertical position innovation test ratio 
     */
    @MavlinkMessageField(
        position = 5,
        length = 4
    )
    public final Builder posVertRatio(float posVertRatio) {
      this.posVertRatio = posVertRatio;
      return this;
    }

    /**
     * Magnetometer innovation test ratio 
     */
    @MavlinkMessageField(
        position = 6,
        length = 4
    )
    public final Builder magRatio(float magRatio) {
      this.magRatio = magRatio;
      return this;
    }

    /**
     * Height above terrain innovation test ratio 
     */
    @MavlinkMessageField(
        position = 7,
        length = 4
    )
    public final Builder haglRatio(float haglRatio) {
      this.haglRatio = haglRatio;
      return this;
    }

    /**
     * True airspeed innovation test ratio 
     */
    @MavlinkMessageField(
        position = 8,
        length = 4
    )
    public final Builder tasRatio(float tasRatio) {
      this.tasRatio = tasRatio;
      return this;
    }

    /**
     * Horizontal position 1-STD accuracy relative to the EKF local origin (m) 
     */
    @MavlinkMessageField(
        position = 9,
        length = 4
    )
    public final Builder posHorizAccuracy(float posHorizAccuracy) {
      this.posHorizAccuracy = posHorizAccuracy;
      return this;
    }

    /**
     * Vertical position 1-STD accuracy relative to the EKF local origin (m) 
     */
    @MavlinkMessageField(
        position = 10,
        length = 4
    )
    public final Builder posVertAccuracy(float posVertAccuracy) {
      this.posVertAccuracy = posVertAccuracy;
      return this;
    }

    public final EstimatorStatus build() {
      return new EstimatorStatus(timeUsec, flags, velRatio, posHorizRatio, posVertRatio, magRatio, haglRatio, tasRatio, posHorizAccuracy, posVertAccuracy);
    }
  }
}