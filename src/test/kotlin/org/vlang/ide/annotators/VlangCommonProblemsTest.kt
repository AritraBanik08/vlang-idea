package org.vlang.ide.annotators

class VlangCommonProblemsTest : AnnotatorTestBase() {
    fun `test break and continue outside loop`() = doTest("break_continue_outside_loop.v")
    fun `test recursive struct`() = doTest("recursive_struct.v")
    fun `test interface field with default value`() = doTest("interface_field_default_value.v")
}
