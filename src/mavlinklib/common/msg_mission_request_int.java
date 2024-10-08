/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MISSION_REQUEST_INT PACKING
package tcpserver.src.mavlinklib.common;
import tcpserver.src.mavlinklib.MAVLinkPacket;
import tcpserver.src.mavlinklib.Messages.MAVLinkMessage;
import tcpserver.src.mavlinklib.Messages.MAVLinkPayload;
        
/**
* Request the information of the mission item with the sequence number seq. The response of the system to this message should be a MISSION_ITEM_INT message. https://mavlink.io/en/protocol/mission.html
*/
public class msg_mission_request_int extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_MISSION_REQUEST_INT = 51;
    public static final int MAVLINK_MSG_ID_MISSION_REQUEST_INT_CRC = 196;
    public static final int MAVLINK_MSG_LENGTH = 5;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MISSION_REQUEST_INT;


      
    /**
    * Sequence
    */
    public int seq;
      
    /**
    * System ID
    */
    public short target_system;
      
    /**
    * Component ID
    */
    public short target_component;
      
    /**
    * Mission type.
    */
    public short mission_type;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MISSION_REQUEST_INT;
        packet.crc_extra = MAVLINK_MSG_ID_MISSION_REQUEST_INT_CRC;
              
        packet.payload.putUnsignedShort(seq);
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedByte(target_component);
              
        packet.payload.putUnsignedByte(mission_type);
        
        return packet;
    }

    /**
    * Decode a mission_request_int message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.seq = payload.getUnsignedShort();
              
        this.target_system = payload.getUnsignedByte();
              
        this.target_component = payload.getUnsignedByte();
              
        this.mission_type = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_mission_request_int(){
        msgid = MAVLINK_MSG_ID_MISSION_REQUEST_INT;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_mission_request_int(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_MISSION_REQUEST_INT;
        unpack(mavLinkPacket.payload);
    }

            
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_MISSION_REQUEST_INT - sysid:"+sysid+" compid:"+compid+" seq:"+seq+" target_system:"+target_system+" target_component:"+target_component+" mission_type:"+mission_type+"";
    }
}
        