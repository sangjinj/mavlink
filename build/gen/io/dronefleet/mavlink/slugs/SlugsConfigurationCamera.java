package io.dronefleet.mavlink.slugs;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;

/**
 * Control for camara. 
 */
@MavlinkMessage(
    id = 188,
    crc = 5
)
public final class SlugsConfigurationCamera {
  private final int target;

  private final int idorder;

  private final int order;

  private SlugsConfigurationCamera(int target, int idorder, int order) {
    this.target = target;
    this.idorder = idorder;
    this.order = order;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * The system setting the commands 
   */
  @MavlinkMessageField(
      position = 1,
      length = 1
  )
  public final int target() {
    return target;
  }

  /**
   * ID 0: brightness 1: aperture 2: iris 3: ICR 4: backlight 
   */
  @MavlinkMessageField(
      position = 2,
      length = 1
  )
  public final int idorder() {
    return idorder;
  }

  /**
   * 1: up/on 2: down/off 3: auto/reset/no action 
   */
  @MavlinkMessageField(
      position = 3,
      length = 1
  )
  public final int order() {
    return order;
  }

  public class Builder {
    private int target;

    private int idorder;

    private int order;

    private Builder() {
    }

    /**
     * The system setting the commands 
     */
    @MavlinkMessageField(
        position = 1,
        length = 1
    )
    public final Builder target(int target) {
      this.target = target;
      return this;
    }

    /**
     * ID 0: brightness 1: aperture 2: iris 3: ICR 4: backlight 
     */
    @MavlinkMessageField(
        position = 2,
        length = 1
    )
    public final Builder idorder(int idorder) {
      this.idorder = idorder;
      return this;
    }

    /**
     * 1: up/on 2: down/off 3: auto/reset/no action 
     */
    @MavlinkMessageField(
        position = 3,
        length = 1
    )
    public final Builder order(int order) {
      this.order = order;
      return this;
    }

    public final SlugsConfigurationCamera build() {
      return new SlugsConfigurationCamera(target, idorder, order);
    }
  }
}
