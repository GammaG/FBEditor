package de.FBEditor;


/**
 * Class modelling firmware and box information
 * 
 */
public class FritzBoxFirmware {

    private String FritzboxName;
    private int boxtype; // Muss Integer sein wegen neuen Firmware Typ > 127
    private byte majorFirmwareVersion;
    private byte minorFirmwareVersion;
    private String modFirmwareVersion;
    @SuppressWarnings("unused")
    private String language;

    /**
     * Firmware Constructor using Strings
     * 
     * @param FritzboxName
     * @param boxtype
     * @param majorFirmwareVersion
     * @param minorFirmwareVersion
     * @param modFirmwareVersion
     * @param language
     */
    public FritzBoxFirmware(String FritzboxName, String boxtype,
            String majorFirmwareVersion, String minorFirmwareVersion,
            String modFirmwareVersion, String language) {
        this.FritzboxName = FritzboxName;
        this.boxtype = Integer.parseInt(boxtype);
        this.majorFirmwareVersion = Byte.parseByte(majorFirmwareVersion);
        this.minorFirmwareVersion = Byte.parseByte(minorFirmwareVersion);
        this.modFirmwareVersion = modFirmwareVersion;
        this.language = language;
    }

    public String getFritzboxName() {
        return FritzboxName;
    }

    /**
     * @return Returns the boxtype.
     */
    public final int getBoxType() {
        return boxtype;
    }

    /**
     * @return Returns the majorFirmwareVersion.
     */
    public final byte getMajorFirmwareVersion() {
        return majorFirmwareVersion;
    }

    /**
     * @return Returns the minorFirmwareVersion.
     */
    public final byte getMinorFirmwareVersion() {
        return minorFirmwareVersion;
    }

    /**
     * @return Returns the minorFirmwareVersion.
     */
    public final String getModFirmwareVersion() {
        return modFirmwareVersion;
    }

    /**
     * @return Returns the majorFirmwareVersion.
     */
    public final String getFirmwareVersion() {
        String boxtypeStr = Integer.toString(boxtype);
        String majorStr = Byte.toString(majorFirmwareVersion);
        String minorStr = Byte.toString(minorFirmwareVersion);
        if (boxtypeStr.length() == 1) {
            boxtypeStr = "0" + boxtypeStr;
        }
        if (majorStr.length() == 1) {
            majorStr = "0" + majorStr;
        }
        if (minorStr.length() == 1) {
            minorStr = "0" + minorStr;
        }
        return boxtypeStr + "." + majorStr + "." + minorStr; // +
                                                                // modFirmwareVersion;
    }

    public String getBoxName() {

        System.out.println( "Debug FritzBoxFirmware: " + FritzboxName + " -> " + boxtype );
 	    
        if ((FritzboxName.length() > 0) && (boxtype > 0)) {
         return FritzboxName;
        } else {
         switch (boxtype) {
          case 6:
           return "FRITZ!Box Fon";
          case 8:
           return "FRITZ!Box Fon WLAN";
          case 9:
           return "Fritz!Box SL WLAN";
          case 10:
           return "Fritz!Box SL";
          case 11:
           return "FRITZ!Box ata";
          case 12:
           return "FRITZ!Box 5050";
          case 14:
           return "FRITZ!Box 7050";
          case 15:
           return "Eumex 300 IP";
          case 16:
           return "FRITZ!Box 3050";
          case 17:
           return "FRITZ!Box 2030";
          case 19:
           return "FRITZ!Box 3070";
          case 20:
           return "FRITZ!Box 2070";
          case 21:
           return "FRITZ!Box 3030";
          case 23:
           return "FRITZ!Box 5010";
          case 25:
           return "FRITZ!Box 5012";
          case 27:
           return "T-Com Sinus W 500V";
          case 28:
           return "Speedport W501V";
          case 29:
           return "FRITZ!Box 7170";
          case 30:
           return "FRITZ!Box 7140";
          case 33:
           return "Speedport W701V";
          case 34:
           return "Speedport W900V";
          case 38:
           return "FRITZ!Box 7150";
          case 40:
           return "FRITZ!Box 7141";
          case 43:
           return "FRITZ!Box 5140";
          case 44:
           return "FRITZ!Box 3130";
          case 49:
           return "FRITZ!Box 3170";
          case 50:
           return "FRITZ!Box 3131";
          case 51:
           return "FRITZ!Box 2170";
          case 54:
           return "FRITZ!Box 7270";
          case 58:
           return "FRITZ!Box 7170 (CH-AT-Edition)";
          case 60:
           return "FRITZ!Box 7113";
          case 65:
           return "Speedport W920V";
          case 67:
           return "FRITZ!Box 3270";
          case 73:
           return "FRITZ!Box 7240";
          case 74:
           return "FRITZ!Box 7270v3";
          case 75:
           return "FRITZ!Box 7570";
          case 81:
           return "FRITZ!Box 7570 HN";
          case 84:
           return "FRITZ!Box 7390";
          case 85:
           return "FRITZ!Box 6360 Cable";
          case 87:
           return "FRITZ!Box 7112";
          case 93:
           return "Speedport W501V";
          case 96:
           return "FRITZ!Box 3270 v3";
          case 99:
           return "FRITZ!Box 7340";
          case 100:
           return "FRITZ!Box 7320";
          case 101:
           return "FRITZ!Box Fon WLAN Speedport W701V";
          case 102:
           return "FRITZ!Box Fon WLAN Speedport W900V";
          case 103:
           return "FRITZ!Box 3370";
          case 104:
           return "FRITZ!Box 6320 Cable";
          case 105:
           return "FRITZ!Box 6840 LTE";
          case 107:
           return "FRITZ!Box 7330";
          case 108:
           return "FRITZ!Box 6810 LTE";
          case 109:
           return "FRITZ!Box 7360 SL";
          case 110:
           return "FRITZ!Box 6320 v2 Cable";
          case 111:
           return "FRITZ!Box 7360";
          case 113:
           return "FRITZ!Box 7490";
          case 115:
           return "FRITZ!Box 6340 Cable";
          case 116:
           return "FRITZ!Box 7330 SL";
          case 117:
           return "FRITZ!Box 7312";
          case 120:
           return "FRITZ!Box 7272";
          case 121:
           return "FRITZ!Box 3390";
          case 123:
           return "FRITZ!Box 6842 LTE";
          case 124:
           return "FRITZ!Box 7360";
          case 125:
           return "FRITZ!Box 3270 v3 (IT-Edition)";
          case 126:
           return "FRITZ!Box 3272";
          case 131:
           return "FRITZ!Box 7362 SL";
          case 137:
           return "FRITZ!Box 7412";
          case 140:
           return "FRITZ!Box 3490";
          case 141:
           return "FRITZ!Box 6490 Cable";
          default:
           return "unknown";
         }
        }
    }
}
