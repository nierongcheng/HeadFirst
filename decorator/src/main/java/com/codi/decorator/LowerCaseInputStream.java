package com.codi.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Codi on 2015/7/15 0015.
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Constructs a new {@code FilterInputStream} with the specified input
     * stream as source.
     * <p/>
     * <p><strong>Warning:</strong> passing a null source creates an invalid
     * {@code FilterInputStream}, that fails on every method that is not
     * overridden. Subclasses should check for null in their constructors.
     *
     * @param in the input stream to filter reads on.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c != -1 ? Character.toLowerCase(c) : c;
    }

    @Override
    public int read(byte[] buffer, int byteOffset, int byteCount) throws IOException {
        int result = super.read(buffer, byteOffset, byteCount);
        for(int i = byteOffset; i < byteOffset + result; i++) {
            buffer[i] = (byte) Character.toLowerCase(buffer[i]);
        }
        return result;
    }
}
