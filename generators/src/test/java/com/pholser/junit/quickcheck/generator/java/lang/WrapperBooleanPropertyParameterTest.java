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

package com.pholser.junit.quickcheck.generator.java.lang;

import static com.pholser.junit.quickcheck.Generating.verifyBooleans;
import static java.util.Arrays.asList;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import com.pholser.junit.quickcheck.Generating;
import com.pholser.junit.quickcheck.generator.BasicGeneratorPropertyParameterTest;
import java.util.List;

public class WrapperBooleanPropertyParameterTest
    extends BasicGeneratorPropertyParameterTest {

    public static final Boolean TYPE_BEARER = null;

    @Override protected void primeSourceOfRandomness() {
        when(Generating.booleans(randomForParameterGenerator))
            .thenReturn(true).thenReturn(false);
    }

    @Override protected int trials() {
        return 2;
    }

    @Override protected List<?> randomValues() {
        return asList(true, false);
    }

    @Override public void verifyInteractionWithRandomness() {
        verifyBooleans(randomForParameterGenerator, times(2));
    }
}
