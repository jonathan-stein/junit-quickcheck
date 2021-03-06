/*
 The MIT License

 Copyright (c) 2010-2020 Paul R. Holser, Jr.

 Permission is hereby granted, free of charge, to any person obtaining
 a copy of this software and associated documentation files (the
 "Software"), to deal in the Software without restriction, including
 without limitation the rights to use, copy, modify, merge, publish,
 distribute, sublicense, and/or sell copies of the Software, and to
 permit persons to whom the Software is furnished to do so, subject to
 the following conditions:

 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package com.pholser.junit.quickcheck.test.generator;

import static java.util.Arrays.asList;

import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.internal.generator.ZilchGenerator;
import java.util.Iterator;
import java.util.List;

public class TestGeneratorSource implements Iterable<Generator<?>> {
    @Override public Iterator<Generator<?>> iterator() {
        List<Generator<?>> generators =
            asList(
                new ABox(),
                new AList(),
                new ADecimal(),
                new ABigInt(),
                new ABool(),
                new AByte(),
                new ACallable<>(),
                new AChar(),
                new ADouble(),
                new AFloat(),
                new AMap(),
                new AnInt(),
                new ALong(),
                new AShort(),
                new AString(),
                new ZilchGenerator());

        return generators.iterator();
    }
}
