package org.dyndns.fules;

import android.util.Log;
import java.util.HashSet;
import java.io.File;

/*
 * It _seems_ like I've managed to replace the NDK symlink
 * code with regular calls. Maybe. More testing is needed.
 */

public class Symlink {
    public static final String TAG = "Symlink";

    public static int create(String from, String to) {
        return 1; // Yeah, but...
    }

    public static String readLink(String name) {
        return name;
    }

    public static boolean isLink(String name) {
        return true;
    }

    public static String resolveLink(String name) {
        return "symbolic string";
    }

    public static File resolveLink(File f) {
        try {
            return f.getCanonicalFile();
        } catch(Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
        return f;
    }
}
