/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Parameters of an object table vertex buffer entry.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be a valid {@code VkObjectEntryTypeNVX} value</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code buffer} &ndash; specifies the {@code VkBuffer} that can be bound as vertex bufer</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkObjectTableVertexBufferEntryNVX {
 *     VkObjectEntryTypeNVX type;
 *     VkObjectEntryUsageFlagsNVX flags;
 *     VkBuffer buffer;
 * }</code></pre>
 */
public class VkObjectTableVertexBufferEntryNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        FLAGS,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
    }

    VkObjectTableVertexBufferEntryNVX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkObjectTableVertexBufferEntryNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkObjectTableVertexBufferEntryNVX(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("VkObjectEntryTypeNVX")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkObjectEntryUsageFlagsNVX")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code buffer} field. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@code type} field. */
    public VkObjectTableVertexBufferEntryNVX type(@NativeType("VkObjectEntryTypeNVX") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkObjectTableVertexBufferEntryNVX flags(@NativeType("VkObjectEntryUsageFlagsNVX") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkObjectTableVertexBufferEntryNVX buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkObjectTableVertexBufferEntryNVX set(
        int type,
        int flags,
        long buffer
    ) {
        type(type);
        flags(flags);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkObjectTableVertexBufferEntryNVX set(VkObjectTableVertexBufferEntryNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkObjectTableVertexBufferEntryNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkObjectTableVertexBufferEntryNVX malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkObjectTableVertexBufferEntryNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkObjectTableVertexBufferEntryNVX calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkObjectTableVertexBufferEntryNVX} instance allocated with {@link BufferUtils}. */
    public static VkObjectTableVertexBufferEntryNVX create() {
        return new VkObjectTableVertexBufferEntryNVX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkObjectTableVertexBufferEntryNVX} instance for the specified memory address. */
    public static VkObjectTableVertexBufferEntryNVX create(long address) {
        return new VkObjectTableVertexBufferEntryNVX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkObjectTableVertexBufferEntryNVX createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkObjectTableVertexBufferEntryNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTableVertexBufferEntryNVX.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTableVertexBufferEntryNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTableVertexBufferEntryNVX.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTableVertexBufferEntryNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTableVertexBufferEntryNVX.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkObjectTableVertexBufferEntryNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkObjectTableVertexBufferEntryNVX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkObjectTableVertexBufferEntryNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkObjectTableVertexBufferEntryNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkObjectTableVertexBufferEntryNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkObjectTableVertexBufferEntryNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkObjectTableVertexBufferEntryNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkObjectTableVertexBufferEntryNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkObjectTableVertexBufferEntryNVX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkObjectTableVertexBufferEntryNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkObjectTableVertexBufferEntryNVX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkObjectTableVertexBufferEntryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTableVertexBufferEntryNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkObjectTableVertexBufferEntryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTableVertexBufferEntryNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkObjectTableVertexBufferEntryNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkObjectTableVertexBufferEntryNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTableVertexBufferEntryNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkObjectTableVertexBufferEntryNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkObjectTableVertexBufferEntryNVX.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkObjectTableVertexBufferEntryNVX.FLAGS); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetLong(struct + VkObjectTableVertexBufferEntryNVX.BUFFER); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkObjectTableVertexBufferEntryNVX.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkObjectTableVertexBufferEntryNVX.FLAGS, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutLong(struct + VkObjectTableVertexBufferEntryNVX.BUFFER, value); }

    // -----------------------------------

    /** An array of {@link VkObjectTableVertexBufferEntryNVX} structs. */
    public static class Buffer extends StructBuffer<VkObjectTableVertexBufferEntryNVX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkObjectTableVertexBufferEntryNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkObjectTableVertexBufferEntryNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkObjectTableVertexBufferEntryNVX newInstance(long address) {
            return new VkObjectTableVertexBufferEntryNVX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("VkObjectEntryTypeNVX")
        public int type() { return VkObjectTableVertexBufferEntryNVX.ntype(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkObjectEntryUsageFlagsNVX")
        public int flags() { return VkObjectTableVertexBufferEntryNVX.nflags(address()); }
        /** Returns the value of the {@code buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkObjectTableVertexBufferEntryNVX.nbuffer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public VkObjectTableVertexBufferEntryNVX.Buffer type(@NativeType("VkObjectEntryTypeNVX") int value) { VkObjectTableVertexBufferEntryNVX.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkObjectTableVertexBufferEntryNVX.Buffer flags(@NativeType("VkObjectEntryUsageFlagsNVX") int value) { VkObjectTableVertexBufferEntryNVX.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkObjectTableVertexBufferEntryNVX.Buffer buffer(@NativeType("VkBuffer") long value) { VkObjectTableVertexBufferEntryNVX.nbuffer(address(), value); return this; }

    }

}