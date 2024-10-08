/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE STATUS_REPORT PACKING
package tcpserver.src.mavlinklib.ardupilotmega;
import tcpserver.src.mavlinklib.MAVLinkPacket;
import tcpserver.src.mavlinklib.Messages.MAVLinkMessage;
import tcpserver.src.mavlinklib.Messages.MAVLinkPayload;
        
/**
* Atmospheric Measurement Sensor Status Report
*/
public class msg_status_report extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_STATUS_REPORT = 12011;
    public static final int MAVLINK_MSG_ID_STATUS_REPORT_CRC = 254;
    public static final int MAVLINK_MSG_LENGTH = 2;
    private static final long serialVersionUID = MAVLINK_MSG_ID_STATUS_REPORT;


      
    /**
    * Bitmap of Sensor Status Report
    */
    public short sensor_status;
      
    /**
    * Sensor Data Period(reserverd : 0, 1sec:1 ~ 5sec:5)
    */
    public short sensor_data_period;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_STATUS_REPORT;
        packet.crc_extra = MAVLINK_MSG_ID_STATUS_REPORT_CRC;
              
        packet.payload.putUnsignedByte(sensor_status);
              
        packet.payload.putUnsignedByte(sensor_data_period);
        
        return packet;
    }

    /**
    * Decode a status_report message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.sensor_status = payload.getUnsignedByte();
              
        this.sensor_data_period = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_status_report(){
        msgid = MAVLINK_MSG_ID_STATUS_REPORT;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_status_report(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_STATUS_REPORT;
        unpack(mavLinkPacket.payload);
    }

        
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_STATUS_REPORT - sysid:"+sysid+" compid:"+compid+" sensor_status:"+sensor_status+" sensor_data_period:"+sensor_data_period+"";
    }
}
        