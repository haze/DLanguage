package net.masterthought.dlanguage.resolve;

/**
 * Test class for resolving references.  To add a new test, add a method to this class following the conventions below.
 *  - If your test is named `testThing` then you should create a `Thing` directory under `tests/gold/resolve`.
 *  - Add D files to the new directory.
 *  - In your files, insert "<ref>" right before the element you want to resolve.
 *  - Insert "<resolved>" right before the element you wish for the reference to resolve to.
 */
public class DResolveTest extends DResolveTestCase {
    public void testPrimaryExpressionToFunctionDefinition() { doTest(); }

}

