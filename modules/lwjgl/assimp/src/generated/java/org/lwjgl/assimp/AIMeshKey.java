/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Binds a anim mesh to a specific point in time.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mTime} &ndash; The time of this key</li>
 * <li>{@code mValue} &ndash; 
 * Index into the {@link AIMesh}{@code ::mAnimMeshes} array of the mesh coresponding to the {@link AIMeshAnim} hosting this key frame. The referenced anim mesh is
 * evaluated according to the rules defined in the docs for {@link AIAnimMesh}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiMeshKey {
 *     double mTime;
 *     unsigned int mValue;
 * }</code></pre>
 */
@NativeType("struct aiMeshKey")
public class AIMeshKey extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MTIME,
        MVALUE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MTIME = layout.offsetof(0);
        MVALUE = layout.offsetof(1);
    }

    AIMeshKey(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AIMeshKey} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMeshKey(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code mTime} field. */
    public double mTime() { return nmTime(address()); }
    /** Returns the value of the {@code mValue} field. */
    @NativeType("unsigned int")
    public int mValue() { return nmValue(address()); }

    /** Sets the specified value to the {@code mTime} field. */
    public AIMeshKey mTime(double value) { nmTime(address(), value); return this; }
    /** Sets the specified value to the {@code mValue} field. */
    public AIMeshKey mValue(@NativeType("unsigned int") int value) { nmValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIMeshKey set(
        double mTime,
        int mValue
    ) {
        mTime(mTime);
        mValue(mValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIMeshKey set(AIMeshKey src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link AIMeshKey} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMeshKey malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link AIMeshKey} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMeshKey calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link AIMeshKey} instance allocated with {@link BufferUtils}. */
    public static AIMeshKey create() {
        return new AIMeshKey(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link AIMeshKey} instance for the specified memory address. */
    public static AIMeshKey create(long address) {
        return new AIMeshKey(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMeshKey createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link AIMeshKey.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshKey.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshKey.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshKey.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshKey.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshKey.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link AIMeshKey.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIMeshKey.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMeshKey.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link AIMeshKey} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIMeshKey mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link AIMeshKey} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIMeshKey callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link AIMeshKey} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMeshKey mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link AIMeshKey} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMeshKey callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIMeshKey.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshKey.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIMeshKey.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshKey.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIMeshKey.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMeshKey.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshKey.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMeshKey.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mTime}. */
    public static double nmTime(long struct) { return memGetDouble(struct + AIMeshKey.MTIME); }
    /** Unsafe version of {@link #mValue}. */
    public static int nmValue(long struct) { return memGetInt(struct + AIMeshKey.MVALUE); }

    /** Unsafe version of {@link #mTime(double) mTime}. */
    public static void nmTime(long struct, double value) { memPutDouble(struct + AIMeshKey.MTIME, value); }
    /** Unsafe version of {@link #mValue(int) mValue}. */
    public static void nmValue(long struct, int value) { memPutInt(struct + AIMeshKey.MVALUE, value); }

    // -----------------------------------

    /** An array of {@link AIMeshKey} structs. */
    public static class Buffer extends StructBuffer<AIMeshKey, Buffer> implements NativeResource {

        /**
         * Creates a new {@link AIMeshKey.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMeshKey#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected AIMeshKey newInstance(long address) {
            return new AIMeshKey(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code mTime} field. */
        public double mTime() { return AIMeshKey.nmTime(address()); }
        /** Returns the value of the {@code mValue} field. */
        @NativeType("unsigned int")
        public int mValue() { return AIMeshKey.nmValue(address()); }

        /** Sets the specified value to the {@code mTime} field. */
        public AIMeshKey.Buffer mTime(double value) { AIMeshKey.nmTime(address(), value); return this; }
        /** Sets the specified value to the {@code mValue} field. */
        public AIMeshKey.Buffer mValue(@NativeType("unsigned int") int value) { AIMeshKey.nmValue(address(), value); return this; }

    }

}