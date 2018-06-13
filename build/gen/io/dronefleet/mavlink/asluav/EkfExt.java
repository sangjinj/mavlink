package io.dronefleet.mavlink.asluav;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;
import java.math.BigInteger;

/**
 * Extended EKF state estimates for ASLUAVs 
 */
@MavlinkMessage(
    id = 206,
    crc = 64
)
public final class EkfExt {
  private final BigInteger timestamp;

  private final float windspeed;

  private final float winddir;

  private final float windz;

  private final float airspeed;

  private final float beta;

  private final float alpha;

  private EkfExt(BigInteger timestamp, float windspeed, float winddir, float windz, float airspeed,
      float beta, float alpha) {
    this.timestamp = timestamp;
    this.windspeed = windspeed;
    this.winddir = winddir;
    this.windz = windz;
    this.airspeed = airspeed;
    this.beta = beta;
    this.alpha = alpha;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Time since system start 
   */
  @MavlinkMessageField(
      position = 1,
      length = 8
  )
  public final BigInteger timestamp() {
    return timestamp;
  }

  /**
   * Magnitude of wind velocity (in lateral inertial plane) 
   */
  @MavlinkMessageField(
      position = 2,
      length = 4
  )
  public final float windspeed() {
    return windspeed;
  }

  /**
   * Wind heading angle from North 
   */
  @MavlinkMessageField(
      position = 3,
      length = 4
  )
  public final float winddir() {
    return winddir;
  }

  /**
   * Z (Down) component of inertial wind velocity 
   */
  @MavlinkMessageField(
      position = 4,
      length = 4
  )
  public final float windz() {
    return windz;
  }

  /**
   * Magnitude of air velocity 
   */
  @MavlinkMessageField(
      position = 5,
      length = 4
  )
  public final float airspeed() {
    return airspeed;
  }

  /**
   * Sideslip angle 
   */
  @MavlinkMessageField(
      position = 6,
      length = 4
  )
  public final float beta() {
    return beta;
  }

  /**
   * Angle of attack 
   */
  @MavlinkMessageField(
      position = 7,
      length = 4
  )
  public final float alpha() {
    return alpha;
  }

  public class Builder {
    private BigInteger timestamp;

    private float windspeed;

    private float winddir;

    private float windz;

    private float airspeed;

    private float beta;

    private float alpha;

    private Builder() {
    }

    /**
     * Time since system start 
     */
    @MavlinkMessageField(
        position = 1,
        length = 8
    )
    public final Builder timestamp(BigInteger timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    /**
     * Magnitude of wind velocity (in lateral inertial plane) 
     */
    @MavlinkMessageField(
        position = 2,
        length = 4
    )
    public final Builder windspeed(float windspeed) {
      this.windspeed = windspeed;
      return this;
    }

    /**
     * Wind heading angle from North 
     */
    @MavlinkMessageField(
        position = 3,
        length = 4
    )
    public final Builder winddir(float winddir) {
      this.winddir = winddir;
      return this;
    }

    /**
     * Z (Down) component of inertial wind velocity 
     */
    @MavlinkMessageField(
        position = 4,
        length = 4
    )
    public final Builder windz(float windz) {
      this.windz = windz;
      return this;
    }

    /**
     * Magnitude of air velocity 
     */
    @MavlinkMessageField(
        position = 5,
        length = 4
    )
    public final Builder airspeed(float airspeed) {
      this.airspeed = airspeed;
      return this;
    }

    /**
     * Sideslip angle 
     */
    @MavlinkMessageField(
        position = 6,
        length = 4
    )
    public final Builder beta(float beta) {
      this.beta = beta;
      return this;
    }

    /**
     * Angle of attack 
     */
    @MavlinkMessageField(
        position = 7,
        length = 4
    )
    public final Builder alpha(float alpha) {
      this.alpha = alpha;
      return this;
    }

    public final EkfExt build() {
      return new EkfExt(timestamp, windspeed, winddir, windz, airspeed, beta, alpha);
    }
  }
}
