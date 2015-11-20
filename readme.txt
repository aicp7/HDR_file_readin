Introduction

This java program is used to read in the high dynamic range (HDR) files whose file extension is ".hdr". By using this program, the user can convert a HDR file into a floating array to present the HDR image. This present method is the most direct way to present a image. After getting this array, people can do processing to the HDR image such as the tone mapping algorithm.

What is a HDR file? In this writing, high dynamic range (HDR) file means the file whose expansion name is HDR. Actually, its real name is Radiance RGBE. RGBE is an image format created by Greg Ward[1]. As we known, there are three channels in the color image which are red, green and blue. If we use 32-bit floating point to store each channel, we need 96 bits to store one pixel's RGB information. However, Greg Ward created the rgbe way to store the 96 bits information we need. In the rgbe format, each pixel need 32 bits which is 4 bytes. One byte mantissa number for each red, green and blue channels and a shared one byte exponent. So for each pixel, 32 bits is enough which saves 64 bits for each pixel. It's a huge saving because of the huge pixel numbers in a decent resolution image (such as 256*256).[2-4]

In addition, for the aim of compression data, the run length encoding (RLE) way may be used when creating the .hdr file. It depends on the format.

The details of this program and the references in this readme file can be seen in my personal website: http://aicp70.wix.com/aboutme#!1-HDR-file-and-its-readin-program-by-JAVA/c1mbt/68A46011-45CE-4D14-99DA-48FEB362A066

In that writing, I introduced how to convert a HDR file into a floating array to present the HDR image. The floating number array is the normal format for people who are trying to use the hdr image to apply a specific algorithm.