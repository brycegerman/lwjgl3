/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_bindless_multi_draw_indirect = "NVBindlessMultiDrawIndirect".nativeClassGL("NV_bindless_multi_draw_indirect", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension combines NV_vertex_buffer_unified_memory and 
    ARB_multi_draw_indirect to allow the processing of multiple drawing
    commands, whose vertex and index data can be sourced from arbitrary 
    buffer locations, by a single function call.

    The NV_vertex_buffer_unified_memory extension provided a mechanism to 
    specify vertex attrib and element array locations using GPU addresses.
    Prior to this extension, these addresses had to be set through explicit
    function calls. Now the ability to set the pointer addresses indirectly
    by extending the GL_ARB_draw_indirect mechanism has been added.
    
    Combined with other "bindless" extensions, such as NV_bindless_texture and
    NV_shader_buffer_load, it is now possible for the GPU to create draw
    commands that source all resource inputs, which are common to change 
    frequently between draw calls from the GPU: vertex and index buffers, 
    samplers, images and other shader input data stored in buffers.
		"""

	GLvoid.func(
		"MultiDrawArraysIndirectBindlessNV",
		"",

		GLenum.IN("mode", "the primitive mode, such as LINES or TRIANGLES"),
		const _ GLvoid_p.IN("indirect", "an array of DrawArraysIndirectBindlessCommandNV structures (see the extension spec for more information)"),
		GLsizei.IN("drawCount", "the number of structures in the <code>indirect</code> array"),
		GLsizei.IN("stride", "the size of one DrawArraysIndirectBindlessCommandNV structure"),
		GLint.IN("vertexBufferCount", "the number of vertex buffers in the DrawArraysIndirectBindlessCommandNV structure")
	)

	GLvoid.func(
		"MultiDrawElementsIndirectBindlessNV",
		"",

		GLenum.IN("mode", "the primitive mode, such as LINES or TRIANGLES"),
		GLenum.IN("type", "the data type of the element indices, such as UNSIGNED_SHORT or UNSIGNED_INT"),
		const _ GLvoid_p.IN("indirect", "an array of DrawElementsIndirectBindlessCommandNV structures (see the extension spec for more information)"),
		GLsizei.IN("drawCount", "the number of structures in the <code>indirect</code> array"),
		GLsizei.IN("stride", "the size of one DrawElementsIndirectBindlessCommandNV structure"),
		GLint.IN("vertexBufferCount", "the number of vertex buffers in the DrawElementsIndirectBindlessCommandNV structure")
	)
}