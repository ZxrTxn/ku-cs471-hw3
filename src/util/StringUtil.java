/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

package util;

public class StringUtil {
    // single-responsibility principle & reusability
    public static boolean isEmpty(String text) {
        return text == null || text.trim().equals("");
    }
}
