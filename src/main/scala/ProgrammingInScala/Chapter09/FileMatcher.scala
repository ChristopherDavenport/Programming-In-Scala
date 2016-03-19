package ProgrammingInScala.Chapter09

import java.io.File
/**
  * Created by chris on 3/19/16.
  */
object FileMatcher {
  private def FilesHere = new java.io.File(".").listFiles()

  def filesEnding(query: String) =
    FilesHere.filter(_.getName.contains(query))

  def filesRegex(query: String) =
    FilesHere.filter(_.getName.matches(query))


  def filesMatching( matcher:(String) => Boolean) ={
    FilesHere.filter(file => matcher(file.getName))
  }

  def newFilesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def newFilesContaining(query: String) =
    filesMatching(_.contains(query))

  def newFilesRegex(query: String): Array[File] =
    filesMatching(_.matches(query))


}
