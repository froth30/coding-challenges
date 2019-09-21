package com.codesignal

/** CodeSignal Challenge `substitutionCipherDecryption`
  *
  * @author froth30
  * @since  Sep 18, 2019
  */
object substitutionCipherDecryption {

  /** Decrypts a message using a simple substitution cipher.
    *
    * @param a arguments array (for shorter solution) comprising the following three arguments:
    *          <ol>
    *            <li>`contents`           – the contents of the message.
    *            <li>`signature`          – the plaintext half of the substitution cipher.
    *            <li>`encryptedSignature` – the ciphertext half of the substitution cipher.
    *          </ol>
    * @return The decrypted message.
    */
  def substitutionCipherDecryption(a: String*) = {
    // Define plaintext alphabet
    val p = 'a' to 'z'

    // Define ciphertext alphabet
    val c = (p filterNot (a(2) contains _) zip p.filterNot(a(1) contains _)) ++ (a(2) zip a(1))

    // Decrypt message using substitution cipher
    a(0).flatMap(c.toMap get _) mkString
  }

}
