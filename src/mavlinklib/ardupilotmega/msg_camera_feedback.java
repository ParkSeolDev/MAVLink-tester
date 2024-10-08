/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CAMERA_FEEDBACK PACKING
package tcpserver.src.mavlinklib.ardupilotmega;
import tcpserver.src.mavlinklib.MAVLinkPacket;
import tcpserver.src.mavlinklib.Messages.MAVLinkMessage;
import tcpserver.src.mavlinklib.Messages.MAVLinkPayload;
        
/**
* Camera Capture Feedback.
*/
public class msg_camera_feedback extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_CAMERA_FEEDBACK = 180;
    public static final int MAVLINK_MSG_ID_CAMERA_FEEDBACK_CRC = 52;
    public static final int MAVLINK_MSG_LENGTH = 47;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CAMERA_FEEDBACK;


      
    /**
    * Image timestamp (since UNIX epoch), as passed in by CAMERA_STATUS message (or autopilot if no CCB).
    */
    public long time_usec;
      
    /**
    * Latitude.
    */
    public int lat;
      
    /**
    * Longitude.
    */
    public int lng;
      
    /**
    * Altitude Absolute (AMSL).
    */
    public float alt_msl;
      
    /**
    * Altitude Relative (above HOME location).
    */
    public float alt_rel;
      
    /**
    * Camera Roll angle (earth frame, +-180).
    */
    public float roll;
      
    /**
    * Camera Pitch angle (earth frame, +-180).
    */
    public float pitch;
      
    /**
    * Camera Yaw (earth frame, 0-360, true).
    */
    public float yaw;
      
    /**
    * Focal Length.
    */
    public float foc_len;
      
    /**
    * Image index.
    */
    public int img_idx;
      
    /**
    * System ID.
    */
    public short target_system;
      
    /**
    * Camera ID.
    */
    public short cam_idx;
      
    /**
    * Feedback flags.
    */
    public short flags;
      
    /**
    * Completed image captures.
    */
    public int completed_captures;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_CAMERA_FEEDBACK;
        packet.crc_extra = MAVLINK_MSG_ID_CAMERA_FEEDBACK_CRC;
              
        packet.payload.putUnsignedLong(time_usec);
              
        packet.payload.putInt(lat);
              
        packet.payload.putInt(lng);
              
        packet.payload.putFloat(alt_msl);
              
        packet.payload.putFloat(alt_rel);
              
        packet.payload.putFloat(roll);
              
        packet.payload.putFloat(pitch);
              
        packet.payload.putFloat(yaw);
              
        packet.payload.putFloat(foc_len);
              
        packet.payload.putUnsignedShort(img_idx);
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedByte(cam_idx);
              
        packet.payload.putUnsignedByte(flags);
              
        packet.payload.putUnsignedShort(completed_captures);
        
        return packet;
    }

    /**
    * Decode a camera_feedback message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time_usec = payload.getUnsignedLong();
              
        this.lat = payload.getInt();
              
        this.lng = payload.getInt();
              
        this.alt_msl = payload.getFloat();
              
        this.alt_rel = payload.getFloat();
              
        this.roll = payload.getFloat();
              
        this.pitch = payload.getFloat();
              
        this.yaw = payload.getFloat();
              
        this.foc_len = payload.getFloat();
              
        this.img_idx = payload.getUnsignedShort();
              
        this.target_system = payload.getUnsignedByte();
              
        this.cam_idx = payload.getUnsignedByte();
              
        this.flags = payload.getUnsignedByte();
              
        this.completed_captures = payload.getUnsignedShort();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_camera_feedback(){
        msgid = MAVLINK_MSG_ID_CAMERA_FEEDBACK;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_camera_feedback(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_CAMERA_FEEDBACK;
        unpack(mavLinkPacket.payload);
    }

                                
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_CAMERA_FEEDBACK - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" lat:"+lat+" lng:"+lng+" alt_msl:"+alt_msl+" alt_rel:"+alt_rel+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" foc_len:"+foc_len+" img_idx:"+img_idx+" target_system:"+target_system+" cam_idx:"+cam_idx+" flags:"+flags+" completed_captures:"+completed_captures+"";
    }
}
        