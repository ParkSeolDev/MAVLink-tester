/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package tcpserver.src.mavlinklib.enums;

/** 
* Deepstall flight stage.
*/
public class DEEPSTALL_STAGE {
   public static final int DEEPSTALL_STAGE_FLY_TO_LANDING = 0; /* Flying to the landing point. | */
   public static final int DEEPSTALL_STAGE_ESTIMATE_WIND = 1; /* Building an estimate of the wind. | */
   public static final int DEEPSTALL_STAGE_WAIT_FOR_BREAKOUT = 2; /* Waiting to breakout of the loiter to fly the approach. | */
   public static final int DEEPSTALL_STAGE_FLY_TO_ARC = 3; /* Flying to the first arc point to turn around to the landing point. | */
   public static final int DEEPSTALL_STAGE_ARC = 4; /* Turning around back to the deepstall landing point. | */
   public static final int DEEPSTALL_STAGE_APPROACH = 5; /* Approaching the landing point. | */
   public static final int DEEPSTALL_STAGE_LAND = 6; /* Stalling and steering towards the land point. | */
   public static final int DEEPSTALL_STAGE_ENUM_END = 7; /*  | */
}
            