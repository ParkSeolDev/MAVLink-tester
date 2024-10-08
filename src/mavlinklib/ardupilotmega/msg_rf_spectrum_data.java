/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DATA96 PACKING
package tcpserver.src.mavlinklib.ardupilotmega;
import tcpserver.src.mavlinklib.MAVLinkPacket;
import tcpserver.src.mavlinklib.Messages.MAVLinkMessage;
import tcpserver.src.mavlinklib.Messages.MAVLinkPayload;
        
/**
* Data packet, size 96.
*/
public class msg_rf_spectrum_data extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_RF_SPECTRUM_DATA = 3001;
    public static final int MAVLINK_MSG_ID_RF_SPECTRUM_DATA_CRC = 102;
    public static final int MAVLINK_MSG_LENGTH = 81;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RF_SPECTRUM_DATA;

    
    /**
     * BRSRP
     */
    public double BRSRP;
    
    /**
     * BRSRQ
     */
    public double BRSRQ;
    
    /**
     * SNR
     */
    public double SNR;
    
    /**
     * RSRP
     */
    public double RSRP;
    
    /**
     * RSRQ
     */
    public double RSRQ;
    
    /**
     * SINR
     */
    public double SINR;
    
    /**
     * RSSI
     */
    public double RSSI;
    
    /**
     * SSB_RP_TOP1
     */
    public double SSB_RP_TOP1;
    
    /**
     * Timestamp (Source Time).
     */
    public long time_boot_ms;
    
    /**
     * PCI_5G-
     */
    public int PCI_5G;
    
    /**
     * PCI_LTE
     */
    public int PCI_LTE;
    
    /**
     * PCI_TOP1
     */
    public int PCI_TOP1;
    
    /**
     * Src System ID.
     */
    public short src_system;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_RF_SPECTRUM_DATA;
        packet.crc_extra = MAVLINK_MSG_ID_RF_SPECTRUM_DATA_CRC;
        
        packet.payload.putDouble(BRSRP);
        packet.payload.putDouble(BRSRQ);
        packet.payload.putDouble(SNR);
        packet.payload.putDouble(RSRP);
        packet.payload.putDouble(RSRQ);
        packet.payload.putDouble(SINR);
        packet.payload.putDouble(RSSI);
        packet.payload.putDouble(SSB_RP_TOP1);
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putInt(PCI_5G);
        packet.payload.putInt(PCI_LTE);
        packet.payload.putInt(PCI_TOP1);
        packet.payload.putUnsignedByte(src_system);
              
        
        return packet;
    }

    /**
     * Decode a rf_spectrum_data message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.BRSRP = payload.getDouble();
        this.BRSRQ = payload.getDouble();
        this.SNR = payload.getDouble();
        this.RSRP = payload.getDouble();
        this.RSRQ = payload.getDouble();
        this.SINR = payload.getDouble();
        this.RSSI = payload.getDouble();
        this.SSB_RP_TOP1 = payload.getDouble();
        this.time_boot_ms = payload.getUnsignedInt();
        this.PCI_5G = payload.getInt();
        this.PCI_LTE = payload.getInt();
        this.PCI_TOP1 = payload.getInt();
        this.src_system = payload.getUnsignedByte();
        
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_rf_spectrum_data() {
        this.msgid = MAVLINK_MSG_ID_RF_SPECTRUM_DATA;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_rf_spectrum_data( double BRSRP, double BRSRQ, double SNR, double RSRP, double RSRQ, double SINR, double RSSI, double SSB_RP_TOP1, long time_boot_ms, int PCI_5G, int PCI_LTE, int PCI_TOP1, short src_system) {
        this.msgid = MAVLINK_MSG_ID_RF_SPECTRUM_DATA;

        this.BRSRP = BRSRP;
        this.BRSRQ = BRSRQ;
        this.SNR = SNR;
        this.RSRP = RSRP;
        this.RSRQ = RSRQ;
        this.SINR = SINR;
        this.RSSI = RSSI;
        this.SSB_RP_TOP1 = SSB_RP_TOP1;
        this.time_boot_ms = time_boot_ms;
        this.PCI_5G = PCI_5G;
        this.PCI_LTE = PCI_LTE;
        this.PCI_TOP1 = PCI_TOP1;
        this.src_system = src_system;
        
    }



    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_rf_spectrum_data(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RF_SPECTRUM_DATA;
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        
        unpack(mavLinkPacket.payload);
    }

                          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_RF_SPECTRUM_DATA - sysid:"+sysid+" compid:"+compid+" BRSRP:"+BRSRP+" BRSRQ:"+BRSRQ+" SNR:"+SNR+" RSRP:"+RSRP+" RSRQ:"+RSRQ+" SINR:"+SINR+" RSSI:"+RSSI+" SSB_RP_TOP1:"+SSB_RP_TOP1+" time_boot_ms:"+time_boot_ms+" PCI_5G:"+PCI_5G+" PCI_LTE:"+PCI_LTE+" PCI_TOP1:"+PCI_TOP1+" src_system:"+src_system+"";
    }


}
