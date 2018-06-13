package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;
import java.lang.Float;
import java.math.BigInteger;
import java.util.List;

/**
 * null
 */
@MavlinkMessage(
    id = 103,
    crc = 208
)
public final class VisionSpeedEstimate {
  private final BigInteger usec;

  private final float x;

  private final float y;

  private final float z;

  private final List<Float> covariance;

  private VisionSpeedEstimate(BigInteger usec, float x, float y, float z, List<Float> covariance) {
    this.usec = usec;
    this.x = x;
    this.y = y;
    this.z = z;
    this.covariance = covariance;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Timestamp (microseconds, synced to UNIX time or since system boot) 
   */
  @MavlinkMessageField(
      position = 0,
      length = 8
  )
  public final BigInteger usec() {
    return usec;
  }

  /**
   * Global X speed 
   */
  @MavlinkMessageField(
      position = 1,
      length = 4
  )
  public final float x() {
    return x;
  }

  /**
   * Global Y speed 
   */
  @MavlinkMessageField(
      position = 2,
      length = 4
  )
  public final float y() {
    return y;
  }

  /**
   * Global Z speed 
   */
  @MavlinkMessageField(
      position = 3,
      length = 4
  )
  public final float z() {
    return z;
  }

  /**
   * Linear velocity covariance matrix (1st three entries - 1st row, etc.) 
   */
  @MavlinkMessageField(
      position = 5,
      length = 4,
      arraySize = 9,
      extension = true
  )
  public final List<Float> covariance() {
    return covariance;
  }

  public class Builder {
    private BigInteger usec;

    private float x;

    private float y;

    private float z;

    private List<Float> covariance;

    private Builder() {
    }

    /**
     * Timestamp (microseconds, synced to UNIX time or since system boot) 
     */
    @MavlinkMessageField(
        position = 0,
        length = 8
    )
    public final Builder usec(BigInteger usec) {
      this.usec = usec;
      return this;
    }

    /**
     * Global X speed 
     */
    @MavlinkMessageField(
        position = 1,
        length = 4
    )
    public final Builder x(float x) {
      this.x = x;
      return this;
    }

    /**
     * Global Y speed 
     */
    @MavlinkMessageField(
        position = 2,
        length = 4
    )
    public final Builder y(float y) {
      this.y = y;
      return this;
    }

    /**
     * Global Z speed 
     */
    @MavlinkMessageField(
        position = 3,
        length = 4
    )
    public final Builder z(float z) {
      this.z = z;
      return this;
    }

    /**
     * Linear velocity covariance matrix (1st three entries - 1st row, etc.) 
     */
    @MavlinkMessageField(
        position = 5,
        length = 4,
        arraySize = 9,
        extension = true
    )
    public final Builder covariance(List<Float> covariance) {
      this.covariance = covariance;
      return this;
    }

    public final VisionSpeedEstimate build() {
      return new VisionSpeedEstimate(usec, x, y, z, covariance);
    }
  }
}
