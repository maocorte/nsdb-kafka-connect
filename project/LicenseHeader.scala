/*
 * Copyright 2018 Radicalbit S.r.l.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import de.heikoseeberger.sbtheader.FileType
import de.heikoseeberger.sbtheader.HeaderPlugin.autoImport._
import sbt.Def

object LicenseHeader {

  lazy val settings: Seq[Def.Setting[_]] = Seq(
    headerLicense := Some(HeaderLicense.ALv2("2018", "Radicalbit S.r.l.")),
    headerMappings := headerMappings.value ++ Map(
      HeaderFileType.conf    -> HeaderCommentStyle.hashLineComment,
      FileType("properties") -> HeaderCommentStyle.hashLineComment,
      FileType("sbt")        -> HeaderCommentStyle.cStyleBlockComment,
      HeaderFileType.java    -> HeaderCommentStyle.cStyleBlockComment,
      HeaderFileType.scala   -> HeaderCommentStyle.cStyleBlockComment
    )
  )
}