# Image-Encryption-and-Decryption
A JAVA based project aimed at encrypting images with specific keys. The user can upload any image of it's choice and provide an integer key to encryot the same image. The encypted image can only be seen after it is decrypted using the same key.

# Tools and resources
Java is used as the programming language to code the project. JAVA SWING API is used to provide a suitable user interface to the user.
 

Reference : https://www.youtube.com/watch?v=TFgVObJ1u1k

# Algorithm and Implementation
* The user firsts uploads the required image into the software. The image is then converted to byte stream array.
```
  FileInputStream fis = new FileInputStream(file);
  byte[] data = new byte[fis.available()]; 
```
* Now that we have a given key, we take the xor of every element of the byte array with the key. So we get an encrypted image which the user is unable to view normally.
* To get the image back, we again decrypt the image by taking the xor of each element of the byte array with the given key.
```
for (byte b : data) {
        System.out.println(b);
        data[current] = (byte) (b ^ key);
        current++;
}
```
