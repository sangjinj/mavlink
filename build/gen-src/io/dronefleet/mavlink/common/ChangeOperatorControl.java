package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;
import java.lang.Integer;
import java.util.List;

/**
 * Request to control this MAV 
 */
@MavlinkMessage(
    id = 5,
    crc = 217
)
public final class ChangeOperatorControl {
  private final int targetSystem;

  private final int controlRequest;

  private final int version;

  private final List<Integer> passkey;

  private ChangeOperatorControl(int targetSystem, int controlRequest, int version,
      List<Integer> passkey) {
    this.targetSystem = targetSystem;
    this.controlRequest = controlRequest;
    this.version = version;
    this.passkey = passkey;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * System the GCS requests control for 
   */
  @MavlinkMessageField(
      position = 1,
      length = 1
  )
  public final int targetSystem() {
    return targetSystem;
  }

  /**
   * 0: request control of this MAV, 1: Release control of this MAV 
   */
  @MavlinkMessageField(
      position = 2,
      length = 1
  )
  public final int controlRequest() {
    return controlRequest;
  }

  /**
   * 0: key as plaintext, 1-255: future, different hashing/encryption variants. The GCS should in 
   * general use the safest mode possible initially and then gradually move down the encryption 
   * level if it gets a NACK message indicating an encryption mismatch. 
   */
  @MavlinkMessageField(
      position = 3,
      length = 1
  )
  public final int version() {
    return version;
  }

  /**
   * Password / Key, depending on version plaintext or encrypted. 25 or less characters, NULL 
   * terminated. The characters may involve A-Z, a-z, 0-9, and "!?,.-" 
   */
  @MavlinkMessageField(
      position = 4,
      length = 1,
      arraySize = 25
  )
  public final List<Integer> passkey() {
    return passkey;
  }

  public class Builder {
    private int targetSystem;

    private int controlRequest;

    private int version;

    private List<Integer> passkey;

    private Builder() {
    }

    /**
     * System the GCS requests control for 
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
     * 0: request control of this MAV, 1: Release control of this MAV 
     */
    @MavlinkMessageField(
        position = 2,
        length = 1
    )
    public final Builder controlRequest(int controlRequest) {
      this.controlRequest = controlRequest;
      return this;
    }

    /**
     * 0: key as plaintext, 1-255: future, different hashing/encryption variants. The GCS should in 
     * general use the safest mode possible initially and then gradually move down the encryption 
     * level if it gets a NACK message indicating an encryption mismatch. 
     */
    @MavlinkMessageField(
        position = 3,
        length = 1
    )
    public final Builder version(int version) {
      this.version = version;
      return this;
    }

    /**
     * Password / Key, depending on version plaintext or encrypted. 25 or less characters, NULL 
     * terminated. The characters may involve A-Z, a-z, 0-9, and "!?,.-" 
     */
    @MavlinkMessageField(
        position = 4,
        length = 1,
        arraySize = 25
    )
    public final Builder passkey(List<Integer> passkey) {
      this.passkey = passkey;
      return this;
    }

    public final ChangeOperatorControl build() {
      return new ChangeOperatorControl(targetSystem, controlRequest, version, passkey);
    }
  }
}
