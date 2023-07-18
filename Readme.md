# Documentation for a project
This is an example, how to add some documentation to a development project. Usually there is a readme file in the root folder of a project. This file serves as a starting point for any documentation. 

This excercise will require for any participant to create an additional markdown file in the subfolder docs and link it here. As an example, this is the according [trainer-doc.md](docs/trainer-doc.md).

## Participants docs

* [sample-doc.md](docs/sample-doc.md)

## Markdown Examples

The following example describes a [unit](https://en.wikipedia.org/wiki/Unit_testing) test. Code segment runs a unit test to checks if set size can be used:

``` java
    @Test
    public void testSize() {
        MySet set = new MySet();
        assertEquals(0, set.size());
    }
```