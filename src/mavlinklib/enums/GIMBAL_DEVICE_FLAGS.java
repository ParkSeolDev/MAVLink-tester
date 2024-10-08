/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package tcpserver.src.mavlinklib.enums;

/**
 * Flags for gimbal device (lower level) operation.
 */
public class GIMBAL_DEVICE_FLAGS {
   public static final int GIMBAL_DEVICE_FLAGS_RETRACT = 1; /* Set to retracted safe position (no stabilization), takes presedence over all other flags. | */
   public static final int GIMBAL_DEVICE_FLAGS_NEUTRAL = 2; /* Set to neutral/default position, taking precedence over all other flags except RETRACT. Neutral is commonly forward-facing and horizontal (roll=pitch=yaw=0) but may be any orientation. | */
   public static final int GIMBAL_DEVICE_FLAGS_ROLL_LOCK = 4; /* Lock roll angle to absolute angle relative to horizon (not relative to vehicle). This is generally the default with a stabilizing gimbal. | */
   public static final int GIMBAL_DEVICE_FLAGS_PITCH_LOCK = 8; /* Lock pitch angle to absolute angle relative to horizon (not relative to vehicle). This is generally the default with a stabilizing gimbal. | */
   public static final int GIMBAL_DEVICE_FLAGS_YAW_LOCK = 16; /* Lock yaw angle to absolute angle relative to North (not relative to vehicle). If this flag is set, the yaw angle and z component of angular velocity are relative to North (earth frame, x-axis pointing North), else they are relative to the vehicle heading (vehicle frame, earth frame rotated so that the x-axis is pointing forward). | */
   public static final int GIMBAL_DEVICE_FLAGS_YAW_IN_VEHICLE_FRAME = 32; /* Yaw angle and z component of angular velocity are relative to the vehicle heading (vehicle frame, earth frame rotated such that the x-axis is pointing forward). | */
   public static final int GIMBAL_DEVICE_FLAGS_YAW_IN_EARTH_FRAME = 64; /* Yaw angle and z component of angular velocity are relative to North (earth frame, x-axis is pointing North). | */
   public static final int GIMBAL_DEVICE_FLAGS_ACCEPTS_YAW_IN_EARTH_FRAME = 128; /* Gimbal device can accept yaw angle inputs relative to North (earth frame). This flag is only for reporting (attempts to set this flag are ignored). | */
   public static final int GIMBAL_DEVICE_FLAGS_RC_EXCLUSIVE = 256; /* The gimbal orientation is set exclusively by the RC signals feed to the gimbal's radio control inputs. MAVLink messages for setting the gimbal orientation (GIMBAL_DEVICE_SET_ATTITUDE) are ignored. | */
   public static final int GIMBAL_DEVICE_FLAGS_RC_MIXED = 512; /* The gimbal orientation is determined by combining/mixing the RC signals feed to the gimbal's radio control inputs and the MAVLink messages for setting the gimbal orientation (GIMBAL_DEVICE_SET_ATTITUDE). How these two controls are combined or mixed is not defined by the protocol but is up to the implementation. | */
   public static final int GIMBAL_DEVICE_FLAGS_ENUM_END = 513; /*  | */
}
            