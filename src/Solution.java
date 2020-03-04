class Solution {
    public static void main(String[] args) {
        System.out.println(validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
    }

    public static String validIPAddress(String IP) {
        //invalid .split logn so iwill take first

        switch (validateType(IP)) {
            case "neither": {
                return "Neither";
            }
            case "IPv4": {
                String[] strIPv4 = IP.split("\\.");
                for (int i = 0; i < strIPv4.length; i++) {
                    if (strIPv4[i].charAt(0) == '0') {
                        return "Neither";
                    }
                    int val = Integer.parseInt(strIPv4[i]);
                    if (val > 255) {
                        return "Neither";
                    }

                }
                return "IPv4";
            }
            case "IPv6": {
                String[] strIPv6 = IP.split(":");
                for (int j = 0; j < strIPv6.length; j++) {
                    if (strIPv6[j] == null || strIPv6[j].isEmpty() || strIPv6[j].length() > 4) {
                        return "Neither";
                    }

                    if (isHex(strIPv6[j]) == false) {
                        return "Neither";
                    }
                }
                return "IPv6";
            }


        }
        return "Neither";
    }

    private static boolean isHex(String str) {
        return str.matches("^[0-9a-fA-F]+$");

    }

    private static String validateType(String IP) {
        String[] str = IP.split("\\.");
        if (str != null && str.length > 1) {
            return "IPv4";
        } else {
            str = IP.split(":");
        }
        if (str != null && str.length > 1) {
            return "IPv6";
        } else {
            return "neither";
        }


    }
}