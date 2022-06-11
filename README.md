# Adapter Pattern Lab

## Learning Goals

- Use the adapter pattern

## Instructions

Extend our `Camera` functionality from the previous section to support a digital
camera using the adapter pattern as described above. Note that this "digital"
camera is a digital version of either the `CanonCamera` or the `NikonCamera`

Hints:

- You will need access to the `mirrorOps` and `shutterOps`. Create accessor
  methods in the `Camera` class, so you can get those private members
- Our digital camera still has a mirror and a shutter so all those operations
  should apply
- Our photographer will now have a traditional camera as well as a digital
  camera
