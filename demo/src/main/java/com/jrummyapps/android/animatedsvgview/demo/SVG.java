/*
 * Copyright (C) 2016 Jared Rummler <jared.rummler@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.jrummyapps.android.animatedsvgview.demo;

import android.graphics.Color;

/**
 * Some SVGs to play with
 */
public enum SVG {
  GOOGLE(
      new String[]{
          "M142.9,24.2c40.2-13.9,85.3-13.6,125.3,1.1c22.2,8.2,42.5,21,59.9,37.1c-5.8,6.3-12.1,12.2-18.1,18.3 c-11.4,11.4-22.8,22.8-34.2,34.2c-11.3-10.8-25.1-19-40.1-23.6c-17.6-5.3-36.6-6.1-54.6-2.2c-21,4.5-40.5,15.5-55.6,30.9 c-12.2,12.3-21.4,27.5-27,43.9c-20.3-15.8-40.6-31.5-61-47.3C59,73.6,97.6,39.7,142.9,24.2z",
          "M21.4,163.2c3.3-16.2,8.7-32,16.2-46.8c20.3,15.8,40.6,31.5,61,47.3c-8,23.3-8,49.2,0,72.4 c-20.3,15.8-40.6,31.6-60.9,47.3C18.9,246.7,13.2,203.6,21.4,163.2z",
          "M203.7,165.1c58.3,0,116.7,0,175,0c5.8,32.7,4.5,66.8-4.7,98.8c-8.5,29.3-24.6,56.5-47.1,77.2 c-19.7-15.3-39.4-30.6-59.1-45.9c19.5-13.1,33.3-34.3,37.2-57.5c-33.8,0-67.6,0-101.4,0C203.7,213.5,203.7,189.3,203.7,165.1z",
          "M37.5,283.5c20.3-15.7,40.6-31.5,60.9-47.3c7.8,22.9,22.8,43.2,42.6,57.1c12.4,8.7,26.6,14.9,41.4,17.9 c14.6,3,29.7,2.6,44.4,0.1c14.6-2.6,28.7-7.9,41-16.2c19.7,15.3,39.4,30.6,59.1,45.9c-21.3,19.7-48,33.1-76.2,39.6 c-31.2,7.1-64.2,7.3-95.2-1c-24.6-6.5-47.7-18.2-67.6-34.1C67,328.9,49.6,307.5,37.5,283.5z"
      },
      new int[]{
          0xFFEA4335,
          0xFFFBBC05,
          0xFF4285F4,
          0xFF34A853
      },
      400, 400
  ),
  GITHUB(
      new String[]{
          "M256 70.7c-102.6 0-185.9 83.2-185.9 185.9 0 82.1 53.3 151.8 127.1 176.4 9.3 1.7 12.3-4 12.3-8.9V389.4c-51.7 11.3-62.5-21.9-62.5-21.9 -8.4-21.5-20.6-27.2-20.6-27.2 -16.9-11.5 1.3-11.3 1.3-11.3 18.7 1.3 28.5 19.2 28.5 19.2 16.6 28.4 43.5 20.2 54.1 15.4 1.7-12 6.5-20.2 11.8-24.9 -41.3-4.7-84.7-20.6-84.7-91.9 0-20.3 7.3-36.9 19.2-49.9 -1.9-4.7-8.3-23.6 1.8-49.2 0 0 15.6-5 51.1 19.1 14.8-4.1 30.7-6.2 46.5-6.3 15.8 0.1 31.7 2.1 46.6 6.3 35.5-24 51.1-19.1 51.1-19.1 10.1 25.6 3.8 44.5 1.8 49.2 11.9 13 19.1 29.6 19.1 49.9 0 71.4-43.5 87.1-84.9 91.7 6.7 5.8 12.8 17.1 12.8 34.4 0 24.9 0 44.9 0 51 0 4.9 3 10.7 12.4 8.9 73.8-24.6 127-94.3 127-176.4C441.9 153.9 358.6 70.7 256 70.7z"
      },
      new int[]{
          Color.BLACK
      },
      512, 512
  ),
  TWITTER(
      new String[]{
          "m 1999.9999,192.4 c -73.58,32.64 -152.67,54.69 -235.66,64.61 84.7,-50.78 149.77,-131.19 180.41,-227.01 -79.29,47.03 -167.1,81.17 -260.57,99.57 C 1609.3399,49.82 1502.6999,0 1384.6799,0 c -226.6,0 -410.328,183.71 -410.328,410.31 0,32.16 3.628,63.48 10.625,93.51 -341.016,-17.11 -643.368,-180.47 -845.739,-428.72 -35.324,60.6 -55.5583,131.09 -55.5583,206.29 0,142.36 72.4373,267.95 182.5433,341.53 -67.262,-2.13 -130.535,-20.59 -185.8519,-51.32 -0.039,1.71 -0.039,3.42 -0.039,5.16 0,198.803 141.441,364.635 329.145,402.342 -34.426,9.375 -70.676,14.395 -108.098,14.395 -26.441,0 -52.145,-2.578 -77.203,-7.364 52.215,163.008 203.75,281.649 383.304,284.946 -140.429,110.062 -317.351,175.66 -509.5972,175.66 -33.1211,0 -65.7851,-1.949 -97.8828,-5.738 181.586,116.4176 397.27,184.359 628.988,184.359 754.732,0 1167.462,-625.238 1167.462,-1167.47 0,-17.79 -0.41,-35.48 -1.2,-53.08 80.1799,-57.86 149.7399,-130.12 204.7499,-212.41"
      },
      new int[]{
          0xFF00ACED
      },
      2000, 1625.36f
  ),
  JRUMMY_APPS(
      new String[]{
          "M457.9,91.1c0-0.8,0-1.7,0-2.5c-0.1-5.9-0.8-11.9-2-17.7c-5.4-25-20.2-41.4-45.7-46.4c-10.3-2-21.2-2.4-31.8-2.4c-82.8-0.2-165.7-0.1-248.5,0c-7.6,0-15.4,0.1-22.9,1.3c-33,5-53.5,27.2-54,62.7c0,0.6,0,1.1,0,1.7c0,56.6,0,113.2,0,169.8h0v0.4c0,34.6,0,69.3,0.1,103.9c0,5.3,0.5,10.7,1.5,15.8c6.8,31.9,34.9,51.6,67.3,47.2c6.1-0.8,12.1-2.4,17.9-4.2c3.4-1.1,6.5-3.7,5.8-7.8c-0.8-4.3-4.7-3.8-8.1-3.9c-10.6-0.6-21.4-0.5-31.8-2.2c-18.1-3-30.1-13.6-33.8-32.1c-1.5-7.5-2.7-15.1-2.8-22.7c-0.1-31.3-0.1-62.7-0.1-94v-0.4c0-43.2,0-86.5,0-129.7c0-10.6,0.1-21.2,0.5-31.8c0.1-3.5,0.3-7.1,0.5-10.6c0.3-5.2,1.2-10.2,2.7-14.9c0.4-1.2,0.8-2.3,1.3-3.5c2.7-6.4,7-12.1,13.2-16.8c9.6-7.1,20.9-9.6,32.5-9.7c22.6-0.3,45.2-0.1,67.8-0.1c54.1,0,108.2-0.1,162.4,0.1c17.3,0,34.7-0.2,51.9,1.2c22.7,1.8,38.7,19.4,39,41.4c0.4,29,0.9,57.9,0.9,86.9c0,29.2-0.2,58.4-0.3,87.6v0.4c-0.2,33.2-0.4,66.4-0.5,99.6c0,2.5,0,5,0,7.5c-0.1,24.5-18.1,43.7-42.5,43.9c-48.5,0.4-97,0.2-145.5,0.1c-6.9,0-11.2-3.3-12-10.2c-0.7-6.9,0-13.9-0.1-20.8c-0.3-24-0.6-48-1-71.9c-0.1-4.1-0.5-8.3-1.4-12.4c-1.9-9.4-7-14.8-16.5-15.5c-13.9-1-27.9-1.1-41.9-1c-6.1,0-9.7,3.6-10.2,9.7c-0.6,7.4-0.1,14.9-0.2,22.3c-0.3,31-0.5,61.9-0.9,92.9c-0.1,9.6-3.1,18.6-9.7,25.7c-15.7,16.9-35.3,23.2-58,18.6c-12.4-2.5-23.3-8.7-33.9-15.4c-2.2-1.4-4.5-3.4-6.6,0.1c0.1,0.4,0.2,0.8,0.4,1c5.1,5.5,10.3,10.9,15.3,16.5c24.9,28.2,55.4,42.8,93.5,37.3c28.5-4.1,49.9-18.7,62-45.4c2.3-5.1,5.5-8.9,10.5-10.7c5.1-1.8,10.5-3.6,15.9-3.6c47.6-0.6,95.3-0.5,142.9-1.3c15.4-0.3,29.3-5.8,40.3-17.3c12.2-12.7,16.4-28.6,16.4-45.4c0.1-34.8,0.2-69.6,0.2-104.3C458.1,202.3,458,146.7,457.9,91.1z M292.2,246.5c-5.3,4.1-11.1,7.4-17.3,11.4h-0.6c-0.2,0.1-0.4,0.2-0.6,0.4c3.8,5,7.4,9.8,11.2,14.4c18.4,22.4,34.6,46,45.9,72.9c4.9,11.5,10.7,22.6,16,33.9c2.3,4.9,6.1,8.4,11.5,8.4c14,0,27.9-0.3,41.9-1.3c8.5-0.6,13.9-6,15.5-14.6c0.8-4.1,1.2-8.3,1.2-12.4c0-33.9,0-67.8,0-101.7v-0.4c0-55.5,0-111,0-166.6c0-4-0.4-8-1.1-11.9c-1.2-6.6-4.9-11.5-11.8-12.6c-6.4-1-12.8-1.9-19.3-1.9c-79.3-0.1-158.7-0.1-238,0c-10.3,0-20.6,0.5-30.9,1C106,65.9,100,71.1,99.1,80c-0.7,6.8-0.7,13.6-1.2,20.4c-0.3,4.1,1.6,5,5.3,5c36,0.2,72,0.2,107.9,1.2c16.9,0.5,34,1.9,50.5,5.2c28.7,5.7,48.1,22.6,54.9,52c2.6,11.1,2.7,22.4,1.3,33.7C315.6,217.1,308.2,234.1,292.2,246.5z M170,217.5c0.4,9.3,3.3,13.7,11.9,14.4c11.7,0.9,23.6,1.1,35.3,0.1c11.5-1,19.4-8.1,21.4-19.8c1.2-7,1.8-14.3,1.2-21.3c-1.3-16.1-8.8-24.2-23.9-27c-2.4-0.5-5-0.8-7.4-0.8c-10.8,0-21.6,0.1-32.4,0.4c-3.8,0.1-6.2,2.5-6.2,6.5c-0.1,9.8,0,19.5,0,29.3h0.1v17.5C170,216.8,170,217.1,170,217.5z"
      },
      new int[]{
          0xFF1D1D1D
      },
      512, 512
  ),
  BUSYBOX_LOGO(
      new String[]{
          "M481,452.9c0,15.5-12.6,28.1-28.1,28.1H59.1C43.6,481,31,468.4,31,452.9V59.1C31,43.6,43.6,31,59.1,31h393.8c15.5,0,28.1,12.6,28.1,28.1V452.9z",
          "M256.4,397.8l-0.1-0.1l-119.9-71.4v-115l0,0l120.4,64.2l0,0l0.1,0l0,0V398l0,0l-0.1-0.1L256.4,397.8z",
          "M375.7,211.3l-118.8,64.3V398l118.8-71.9L375.7,211.3L375.7,211.3z",
          "M375.7,211.3v84.2L312.3,328l-55.5-52.4v0L375.7,211.3L375.7,211.3z",
          "M433.3,244.4L375.7,274l-64,32.9l-54.8-31.3v0l118.8-64.3l0,0L433.3,244.4z",
          "M255.2,147l120.5,64.3l0,0l54.5-31.3l-54.5-30.7l-63-35.4L255.2,147L255.2,147L255.2,147L255.2,147z",
          "M78.6,178.3l57.6-29.6l64-32.9l54.8,31.3v0l-118.8,64.3l0,0L78.6,178.3z",
          "M255.1,147l1.8,128.7l-0.1,0l-120.5-64.3L255.1,147z",
          "M256.9,275.7L256.9,275.7L255.1,147l0,0l0.1,0l120.5,64.3L256.9,275.7z",
          "M256.9,275.7V350l-91-48.6l9.6-6.1l23.8,13.4L256.9,275.7L256.9,275.7z",
          "M256.8,275.6L256.8,275.6l-0.1,122.3l0.2,0.1L256.8,275.6L256.8,275.6z",
          "M256.8,275.6l-120.5-64.3l0,0l-54.5,31.3l54.5,30.7l63,35.4L256.8,275.6L256.8,275.6L256.8,275.6L256.8,275.6z"
      },
      new int[]{
          0xFF41A4C4,
          0xFFD95545,
          0xFFC54C3F,
          0xFFAA4438,
          0xFFF4F3EE,
          0xFFF4F3EE,
          0xFFF4F3EE,
          0xFFD2D1CC,
          0xFFDCDAD6,
          0xFFC54C3F,
          0xFFD95545,
          0xFFF4F3EE
      },
      512, 512
  );

  public final String[] glyphs;
  public final int[] colors;
  public final float width;
  public final float height;

  SVG(String[] glyphs, int[] colors, float width, float height) {
    this.glyphs = glyphs;   //像素点组成的图像
    this.colors = colors;
    this.width = width;
    this.height = height;
  }

}
