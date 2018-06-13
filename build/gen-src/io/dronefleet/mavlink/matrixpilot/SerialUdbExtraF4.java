package io.dronefleet.mavlink.matrixpilot;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;

/**
 * Backwards compatible version of SERIAL_UDB_EXTRA F4: format 
 */
@MavlinkMessage(
    id = 172,
    crc = 191
)
public final class SerialUdbExtraF4 {
  private final int sueRollStabilizationAilerons;

  private final int sueRollStabilizationRudder;

  private final int suePitchStabilization;

  private final int sueYawStabilizationRudder;

  private final int sueYawStabilizationAileron;

  private final int sueAileronNavigation;

  private final int sueRudderNavigation;

  private final int sueAltitudeholdStabilized;

  private final int sueAltitudeholdWaypoint;

  private final int sueRacingMode;

  private SerialUdbExtraF4(int sueRollStabilizationAilerons, int sueRollStabilizationRudder,
      int suePitchStabilization, int sueYawStabilizationRudder, int sueYawStabilizationAileron,
      int sueAileronNavigation, int sueRudderNavigation, int sueAltitudeholdStabilized,
      int sueAltitudeholdWaypoint, int sueRacingMode) {
    this.sueRollStabilizationAilerons = sueRollStabilizationAilerons;
    this.sueRollStabilizationRudder = sueRollStabilizationRudder;
    this.suePitchStabilization = suePitchStabilization;
    this.sueYawStabilizationRudder = sueYawStabilizationRudder;
    this.sueYawStabilizationAileron = sueYawStabilizationAileron;
    this.sueAileronNavigation = sueAileronNavigation;
    this.sueRudderNavigation = sueRudderNavigation;
    this.sueAltitudeholdStabilized = sueAltitudeholdStabilized;
    this.sueAltitudeholdWaypoint = sueAltitudeholdWaypoint;
    this.sueRacingMode = sueRacingMode;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Serial UDB Extra Roll Stabilization with Ailerons Enabled 
   */
  @MavlinkMessageField(
      position = 1,
      length = 1
  )
  public final int sueRollStabilizationAilerons() {
    return sueRollStabilizationAilerons;
  }

  /**
   * Serial UDB Extra Roll Stabilization with Rudder Enabled 
   */
  @MavlinkMessageField(
      position = 2,
      length = 1
  )
  public final int sueRollStabilizationRudder() {
    return sueRollStabilizationRudder;
  }

  /**
   * Serial UDB Extra Pitch Stabilization Enabled 
   */
  @MavlinkMessageField(
      position = 3,
      length = 1
  )
  public final int suePitchStabilization() {
    return suePitchStabilization;
  }

  /**
   * Serial UDB Extra Yaw Stabilization using Rudder Enabled 
   */
  @MavlinkMessageField(
      position = 4,
      length = 1
  )
  public final int sueYawStabilizationRudder() {
    return sueYawStabilizationRudder;
  }

  /**
   * Serial UDB Extra Yaw Stabilization using Ailerons Enabled 
   */
  @MavlinkMessageField(
      position = 5,
      length = 1
  )
  public final int sueYawStabilizationAileron() {
    return sueYawStabilizationAileron;
  }

  /**
   * Serial UDB Extra Navigation with Ailerons Enabled 
   */
  @MavlinkMessageField(
      position = 6,
      length = 1
  )
  public final int sueAileronNavigation() {
    return sueAileronNavigation;
  }

  /**
   * Serial UDB Extra Navigation with Rudder Enabled 
   */
  @MavlinkMessageField(
      position = 7,
      length = 1
  )
  public final int sueRudderNavigation() {
    return sueRudderNavigation;
  }

  /**
   * Serial UDB Extra Type of Alitude Hold when in Stabilized Mode 
   */
  @MavlinkMessageField(
      position = 8,
      length = 1
  )
  public final int sueAltitudeholdStabilized() {
    return sueAltitudeholdStabilized;
  }

  /**
   * Serial UDB Extra Type of Alitude Hold when in Waypoint Mode 
   */
  @MavlinkMessageField(
      position = 9,
      length = 1
  )
  public final int sueAltitudeholdWaypoint() {
    return sueAltitudeholdWaypoint;
  }

  /**
   * Serial UDB Extra Firmware racing mode enabled 
   */
  @MavlinkMessageField(
      position = 10,
      length = 1
  )
  public final int sueRacingMode() {
    return sueRacingMode;
  }

  public class Builder {
    private int sueRollStabilizationAilerons;

    private int sueRollStabilizationRudder;

    private int suePitchStabilization;

    private int sueYawStabilizationRudder;

    private int sueYawStabilizationAileron;

    private int sueAileronNavigation;

    private int sueRudderNavigation;

    private int sueAltitudeholdStabilized;

    private int sueAltitudeholdWaypoint;

    private int sueRacingMode;

    private Builder() {
    }

    /**
     * Serial UDB Extra Roll Stabilization with Ailerons Enabled 
     */
    @MavlinkMessageField(
        position = 1,
        length = 1
    )
    public final Builder sueRollStabilizationAilerons(int sueRollStabilizationAilerons) {
      this.sueRollStabilizationAilerons = sueRollStabilizationAilerons;
      return this;
    }

    /**
     * Serial UDB Extra Roll Stabilization with Rudder Enabled 
     */
    @MavlinkMessageField(
        position = 2,
        length = 1
    )
    public final Builder sueRollStabilizationRudder(int sueRollStabilizationRudder) {
      this.sueRollStabilizationRudder = sueRollStabilizationRudder;
      return this;
    }

    /**
     * Serial UDB Extra Pitch Stabilization Enabled 
     */
    @MavlinkMessageField(
        position = 3,
        length = 1
    )
    public final Builder suePitchStabilization(int suePitchStabilization) {
      this.suePitchStabilization = suePitchStabilization;
      return this;
    }

    /**
     * Serial UDB Extra Yaw Stabilization using Rudder Enabled 
     */
    @MavlinkMessageField(
        position = 4,
        length = 1
    )
    public final Builder sueYawStabilizationRudder(int sueYawStabilizationRudder) {
      this.sueYawStabilizationRudder = sueYawStabilizationRudder;
      return this;
    }

    /**
     * Serial UDB Extra Yaw Stabilization using Ailerons Enabled 
     */
    @MavlinkMessageField(
        position = 5,
        length = 1
    )
    public final Builder sueYawStabilizationAileron(int sueYawStabilizationAileron) {
      this.sueYawStabilizationAileron = sueYawStabilizationAileron;
      return this;
    }

    /**
     * Serial UDB Extra Navigation with Ailerons Enabled 
     */
    @MavlinkMessageField(
        position = 6,
        length = 1
    )
    public final Builder sueAileronNavigation(int sueAileronNavigation) {
      this.sueAileronNavigation = sueAileronNavigation;
      return this;
    }

    /**
     * Serial UDB Extra Navigation with Rudder Enabled 
     */
    @MavlinkMessageField(
        position = 7,
        length = 1
    )
    public final Builder sueRudderNavigation(int sueRudderNavigation) {
      this.sueRudderNavigation = sueRudderNavigation;
      return this;
    }

    /**
     * Serial UDB Extra Type of Alitude Hold when in Stabilized Mode 
     */
    @MavlinkMessageField(
        position = 8,
        length = 1
    )
    public final Builder sueAltitudeholdStabilized(int sueAltitudeholdStabilized) {
      this.sueAltitudeholdStabilized = sueAltitudeholdStabilized;
      return this;
    }

    /**
     * Serial UDB Extra Type of Alitude Hold when in Waypoint Mode 
     */
    @MavlinkMessageField(
        position = 9,
        length = 1
    )
    public final Builder sueAltitudeholdWaypoint(int sueAltitudeholdWaypoint) {
      this.sueAltitudeholdWaypoint = sueAltitudeholdWaypoint;
      return this;
    }

    /**
     * Serial UDB Extra Firmware racing mode enabled 
     */
    @MavlinkMessageField(
        position = 10,
        length = 1
    )
    public final Builder sueRacingMode(int sueRacingMode) {
      this.sueRacingMode = sueRacingMode;
      return this;
    }

    public final SerialUdbExtraF4 build() {
      return new SerialUdbExtraF4(sueRollStabilizationAilerons, sueRollStabilizationRudder, suePitchStabilization, sueYawStabilizationRudder, sueYawStabilizationAileron, sueAileronNavigation, sueRudderNavigation, sueAltitudeholdStabilized, sueAltitudeholdWaypoint, sueRacingMode);
    }
  }
}