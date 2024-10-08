/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE EKF_STATUS_REPORT PACKING
package tcpserver.src.mavlinklib.ardupilotmega;
import tcpserver.src.mavlinklib.MAVLinkPacket;
import tcpserver.src.mavlinklib.Messages.MAVLinkMessage;
import tcpserver.src.mavlinklib.Messages.MAVLinkPayload;
        
/**
* EKF Status message including flags and variances.
*/
public class msg_ekf_status_report extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_EKF_STATUS_REPORT = 193;
    public static final int MAVLINK_MSG_ID_EKF_STATUS_REPORT_CRC = 71;
    public static final int MAVLINK_MSG_LENGTH = 26;
    private static final long serialVersionUID = MAVLINK_MSG_ID_EKF_STATUS_REPORT;


      
    /**
    * Velocity variance.
    */
    public float velocity_variance;
      
    /**
    * Horizontal Position variance.
    */
    public float pos_horiz_variance;
      
    /**
    * Vertical Position variance.
    */
    public float pos_vert_variance;
      
    /**
    * Compass variance.
    */
    public float compass_variance;
      
    /**
    * Terrain Altitude variance.
    */
    public float terrain_alt_variance;
      
    /**
    * Flags.
    */
    public int flags;
      
    /**
    * Airspeed variance.
    */
    public float airspeed_variance;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_EKF_STATUS_REPORT;
        packet.crc_extra = MAVLINK_MSG_ID_EKF_STATUS_REPORT_CRC;
              
        packet.payload.putFloat(velocity_variance);
              
        packet.payload.putFloat(pos_horiz_variance);
              
        packet.payload.putFloat(pos_vert_variance);
              
        packet.payload.putFloat(compass_variance);
              
        packet.payload.putFloat(terrain_alt_variance);
              
        packet.payload.putUnsignedShort(flags);
              
        packet.payload.putFloat(airspeed_variance);
        
        return packet;
    }

    /**
    * Decode a ekf_status_report message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.velocity_variance = payload.getFloat();
              
        this.pos_horiz_variance = payload.getFloat();
              
        this.pos_vert_variance = payload.getFloat();
              
        this.compass_variance = payload.getFloat();
              
        this.terrain_alt_variance = payload.getFloat();
              
        this.flags = payload.getUnsignedShort();
              
        this.airspeed_variance = payload.getFloat();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_ekf_status_report(){
        msgid = MAVLINK_MSG_ID_EKF_STATUS_REPORT;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_ekf_status_report(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_EKF_STATUS_REPORT;
        unpack(mavLinkPacket.payload);
    }

                  
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_EKF_STATUS_REPORT - sysid:"+sysid+" compid:"+compid+" velocity_variance:"+velocity_variance+" pos_horiz_variance:"+pos_horiz_variance+" pos_vert_variance:"+pos_vert_variance+" compass_variance:"+compass_variance+" terrain_alt_variance:"+terrain_alt_variance+" flags:"+flags+" airspeed_variance:"+airspeed_variance+"";
    }
}
        