package io.github.ehlxr.murmur3;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;

/**
 * @author ehlxr
 */
public class Murmur3Application {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg + " => " + Math.abs(Hashing.murmur3_32_fixed().hashString(arg, Charsets.UTF_8).asInt()));
        }
    }
}
