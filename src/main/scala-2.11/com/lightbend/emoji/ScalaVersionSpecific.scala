/*
 * Copyright (C) 2015-2019 Lightbend Inc. <http://www.lightbend.com>
 */
package com.lightbend.emoji

object ScalaVersionSpecific {
  def checkLengths(sc: StringContext, args: Seq[Any]): Unit =
    sc.checkLengths(args)
}

