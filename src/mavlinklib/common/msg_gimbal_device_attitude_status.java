/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GIMBAL_DEVICE_ATTITUDE_STATUS PACKING
package tcpserver.src.mavlinklib.common;
import tcpserver.src.mavlinklib.MAVLinkPacket;
import tcpserver.src.mavlinklib.MAVLinkPacket.Protocol;
import tcpserver.src.mavlinklib.Messages.MAVLinkMessage;
import tcpserver.src.mavlinklib.Messages.MAVLinkPayload;

/**
 * Message reporting the status of a gimbal device. 
	  This message should be broadcast by a gimbal device component at a low regular rate (e.g. 5 Hz). 
	  For the angles encoded in the quaternion and the angular velocities holds: 
	  If the flag GIMBAL_DEVICE_FLAGS_YAW_IN_VEHICLE_FRAME is set, then they are relative to the vehicle heading (vehicle frame). 
	  If the flag GIMBAL_DEVICE_FLAGS_YAW_IN_EARTH_FRAME is set, then they are relative to absolute North (earth frame). 
	  If neither of these flags are set, then (for backwards compatibility) it holds: 
	  If the flag GIMBAL_DEVICE_FLAGS_YAW_LOCK is set, then they are relative to absolute North (earth frame), 
	  else they are relative to the vehicle heading (vehicle frame). 
	  Other conditions of the flags are not allowed. 
	  The quaternion and angular velocities in the other frame can be calculated from delta_yaw and delta_yaw_velocity as 
	  q_earth = q_delta_yaw * q_vehicle and w_earth = w_delta_yaw_velocity + w_vehicle (if not NaN).
	  If neither the GIMBAL_DEVICE_FLAGS_YAW_IN_VEHICLE_FRAME nor the GIMBAL_DEVICE_FLAGS_YAW_IN_EARTH_FRAME flag is set, 
	  then (for backwards compatibility) the data in the delta_yaw and delta_yaw_velocity fields are to be ignored.
	  New implementations should always set either GIMBAL_DEVICE_FLAGS_YAW_IN_VEHICLE_FRAME or GIMBAL_DEVICE_FLAGS_YAW_IN_EARTH_FRAME, 
	  and always should set delta_yaw and delta_yaw_velocity either to the proper value or NaN.
 */
public class msg_gimbal_device_attitude_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS = 285;
    public static final int MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS_CRC = 137;
    public static final int MAVLINK_MSG_LENGTH = 48;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;

    
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
    
    /**
     * Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation). The frame is described in the message description.
     */
    public float q[] = new float[4];
    
    /**
     * X component of angular velocity (positive: rolling to the right). The frame is described in the message description. NaN if unknown.
     */
    public float angular_velocity_x;
    
    /**
     * Y component of angular velocity (positive: pitching up). The frame is described in the message description. NaN if unknown.
     */
    public float angular_velocity_y;
    
    /**
     * Z component of angular velocity (positive: yawing to the right). The frame is described in the message description. NaN if unknown.
     */
    public float angular_velocity_z;
    
    /**
     * Failure flags (0 for no failure)
     */
    public long failure_flags;
    
    /**
     * Current gimbal flags set.
     */
    public int flags;
    
    /**
     * System ID
     */
    public short target_system;
    
    /**
     * Component ID
     */
    public short target_component;
    
    /**
     * Yaw angle relating the quaternions in earth and body frames (see message description). NaN if unknown.
     */
    public float delta_yaw;
    
    /**
     * Yaw angular velocity relating the angular velocities in earth and body frames (see message description). NaN if unknown.
     */
    public float delta_yaw_velocity;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
//        packet.sysid = sysid;
//        packet.compid = compid;
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;
        packet.crc_extra = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS_CRC;

        packet.payload.putUnsignedInt(time_boot_ms);
        
        for (int i = 0; i < q.length; i++) {
            packet.payload.putFloat(q[i]);
        }
                    
        packet.payload.putFloat(angular_velocity_x);
        packet.payload.putFloat(angular_velocity_y);
        packet.payload.putFloat(angular_velocity_z);
        packet.payload.putUnsignedInt(failure_flags);
        packet.payload.putUnsignedShort(flags);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        if (packet.protocol == Protocol.PROTOCOL_2_0) {
             packet.payload.putFloat(delta_yaw);
             packet.payload.putFloat(delta_yaw_velocity);
        }
        return packet;
    }

    /**
     * Decode a gimbal_device_attitude_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();
        
        for (int i = 0; i < this.q.length; i++) {
            this.q[i] = payload.getFloat();
        }
                
        this.angular_velocity_x = payload.getFloat();
        this.angular_velocity_y = payload.getFloat();
        this.angular_velocity_z = payload.getFloat();
        this.failure_flags = payload.getUnsignedInt();
        this.flags = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (true) { // v2
             this.delta_yaw = payload.getFloat();
             this.delta_yaw_velocity = payload.getFloat();
        }
    }
    
    public void unpack(MAVLinkPayload payload, boolean version1) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();
        
        for (int i = 0; i < this.q.length; i++) {
            this.q[i] = payload.getFloat();
        }
                
        this.angular_velocity_x = payload.getFloat();
        this.angular_velocity_y = payload.getFloat();
        this.angular_velocity_z = payload.getFloat();
        this.failure_flags = payload.getUnsignedInt();
        this.flags = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (version1) { // v1
//             this.delta_yaw = payload.getFloat();
//             this.delta_yaw_velocity = payload.getFloat();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gimbal_device_attitude_status() {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gimbal_device_attitude_status( long time_boot_ms, float[] q, float angular_velocity_x, float angular_velocity_y, float angular_velocity_z, long failure_flags, int flags, short target_system, short target_component, float delta_yaw, float delta_yaw_velocity) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;

        this.time_boot_ms = time_boot_ms;
        this.q = q;
        this.angular_velocity_x = angular_velocity_x;
        this.angular_velocity_y = angular_velocity_y;
        this.angular_velocity_z = angular_velocity_z;
        this.failure_flags = failure_flags;
        this.flags = flags;
        this.target_system = target_system;
        this.target_component = target_component;
        this.delta_yaw = delta_yaw;
        this.delta_yaw_velocity = delta_yaw_velocity;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gimbal_device_attitude_status( long time_boot_ms, float[] q, float angular_velocity_x, float angular_velocity_y, float angular_velocity_z, long failure_flags, int flags, short target_system, short target_component, float delta_yaw, float delta_yaw_velocity, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;
        this.sysid = sysid;
        this.compid = compid;

        this.time_boot_ms = time_boot_ms;
        this.q = q;
        this.angular_velocity_x = angular_velocity_x;
        this.angular_velocity_y = angular_velocity_y;
        this.angular_velocity_z = angular_velocity_z;
        this.failure_flags = failure_flags;
        this.flags = flags;
        this.target_system = target_system;
        this.target_component = target_component;
        this.delta_yaw = delta_yaw;
        this.delta_yaw_velocity = delta_yaw_velocity;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gimbal_device_attitude_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        if (mavLinkPacket.protocol == Protocol.PROTOCOL_2_0) {
        	unpack(mavLinkPacket.payload);
        } else
        	unpack(mavLinkPacket.payload, true);
    }

                          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_GIMBAL_DEVICE_ATTITUDE_STATUS - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" q:"+q+" angular_velocity_x:"+angular_velocity_x+" angular_velocity_y:"+angular_velocity_y+" angular_velocity_z:"+angular_velocity_z+" failure_flags:"+failure_flags+" flags:"+flags+" target_system:"+target_system+" target_component:"+target_component+" delta_yaw:"+delta_yaw+" delta_yaw_velocity:"+delta_yaw_velocity+"";
    }

}
        