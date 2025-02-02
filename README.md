# Groovy NullPointerException in Comparison

This example demonstrates a common error in Groovy related to null pointer exceptions when performing comparisons without proper null handling. Groovy's dynamic typing can make it easy to miss these errors, but they can be avoided with careful coding practices.

## Problem

The `myMethod` function compares two numbers and returns the larger one. However, if either input is `null`, a `NullPointerException` will be thrown during the comparison.

## Solution

The solution involves explicitly checking for `null` values before performing the comparison, using the Elvis operator (`?:`) or safe navigation operator (`?.`).