public class HexToRGB {

    public static void main(String[] args) {
        int[] test = new int[3];
        test = hexStringToRGB("#FF9933");// expected {255, 153, 51}
        for(int rgb : test){System.out.println(rgb);}
        // test =hexStringToRGB("#beaded");// expected {190, 173, 237}
        // test =hexStringToRGB("#Fa3456");// expected {250, 52, 86}

    }

    public static int[] hexStringToRGB(String hex) {

        int[] rgb = new int[3];

        String toHex = hex.replaceAll("#", "").toLowerCase();

        rgb[0] = Integer.parseInt(toHex.substring(0, 2), 16);
        rgb[1] = Integer.parseInt(toHex.substring(2, 4), 16);
        rgb[2] = Integer.parseInt(toHex.substring(4, 6), 16);

        return rgb;
    }

}

/*
 * When working with color values it can sometimes be useful to extract the
 * individual red, green, and blue (RGB) component values for a color. Implement
 * a function that meets these requirements:
 * 
 * Accepts a case-insensitive hexadecimal color string as its parameter (ex.
 * "#FF9933" or "#ff9933")
 * Returns a Map<String, int> with the structure {r: 255, g: 153, b: 51} where
 * r, g, and b range from 0 through 255
 * Note: your implementation does not need to support the shorthand form of
 * hexadecimal notation (ie "#FFF")
 */
