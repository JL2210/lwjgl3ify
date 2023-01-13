package org.lwjglx.opengl;

public class GL32 {
    public static void glDrawElementsBaseVertex(int arg0, int arg1, int arg2, long arg3, int arg4) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glDrawElementsBaseVertex(int arg0, java.nio.ByteBuffer arg1, int arg2) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(arg0, arg1, arg2);
    }

    public static void glDrawElementsBaseVertex(int arg0, java.nio.IntBuffer arg1, int arg2) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(arg0, arg1, arg2);
    }

    public static void glDrawElementsBaseVertex(int arg0, java.nio.ShortBuffer arg1, int arg2) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(arg0, arg1, arg2);
    }

    public static void glDrawElementsInstancedBaseVertex(int arg0, int arg1, int arg2, long arg3, int arg4, int arg5) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glDrawElementsInstancedBaseVertex(int arg0, java.nio.ByteBuffer arg1, int arg2, int arg3) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(arg0, arg1, arg2, arg3);
    }

    public static void glDrawElementsInstancedBaseVertex(int arg0, java.nio.IntBuffer arg1, int arg2, int arg3) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(arg0, arg1, arg2, arg3);
    }

    public static void glDrawElementsInstancedBaseVertex(int arg0, java.nio.ShortBuffer arg1, int arg2, int arg3) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(arg0, arg1, arg2, arg3);
    }

    public static void glDrawRangeElementsBaseVertex(int arg0, int arg1, int arg2, int arg3, int arg4, long arg5, int arg6) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glDrawRangeElementsBaseVertex(int arg0, int arg1, int arg2, java.nio.ByteBuffer arg3, int arg4) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glDrawRangeElementsBaseVertex(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3, int arg4) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glDrawRangeElementsBaseVertex(int arg0, int arg1, int arg2, java.nio.ShortBuffer arg3, int arg4) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(arg0, arg1, arg2, arg3, arg4);
    }

    public static org.lwjglx.opengl.GLSync glFenceSync(int arg0, int arg1) {

        org.lwjglx.opengl.GLSync returnValue = new GLSync(org.lwjgl.opengl.GL32.glFenceSync(arg0, arg1));

        return returnValue;
    }

    public static void glFramebufferTexture(int arg0, int arg1, int arg2, int arg3) {
        org.lwjgl.opengl.GL32.glFramebufferTexture(arg0, arg1, arg2, arg3);
    }

    public static void glGetBufferParameter(int arg0, int arg1, java.nio.LongBuffer arg2) {
        org.lwjgl.opengl.GL32.glGetBufferParameteri64v(arg0, arg1, arg2);
    }

    public static long glGetBufferParameteri64(int arg0, int arg1) {
        return org.lwjgl.opengl.GL32.glGetBufferParameteri64(arg0, arg1);
    }

    public static long glGetInteger64(int arg0) {
        return org.lwjgl.opengl.GL32.glGetInteger64(arg0);
    }

    public static void glGetInteger64(int arg0, int arg1, java.nio.LongBuffer arg2) {
        org.lwjgl.opengl.GL32.glGetInteger64i_v(arg0, arg1, arg2);
    }

    public static void glGetInteger64(int arg0, java.nio.LongBuffer arg1) {
        org.lwjgl.opengl.GL32.glGetInteger64v(arg0, arg1);
    }

    public static void glGetMultisample(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        org.lwjgl.opengl.GL32.glGetMultisamplefv(arg0, arg1, arg2);
    }

    public static void glProvokingVertex(int arg0) {
        org.lwjgl.opengl.GL32.glProvokingVertex(arg0);
    }

    public static void glSampleMaski(int arg0, int arg1) {
        org.lwjgl.opengl.GL32.glSampleMaski(arg0, arg1);
    }

    public static void glTexImage2DMultisample(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        org.lwjgl.opengl.GL32.glTexImage2DMultisample(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glTexImage3DMultisample(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        org.lwjgl.opengl.GL32.glTexImage3DMultisample(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }


}