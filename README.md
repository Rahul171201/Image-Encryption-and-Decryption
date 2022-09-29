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


![s2](https://user-images.githubusercontent.com/70642284/192974988-22f85d13-8c9b-4ff1-baba-aa35982b5f20.jpeg)


* To get the image back, we again decrypt the image by taking the xor of each element of the byte array with the given key.
```

for (byte b : data) {
        System.out.println(b);
        data[current] = (byte) (b ^ key);
        current++;
}
```
# The User Interface
![s1](https://user-images.githubusercontent.com/70642284/192974508-03be3426-b3df-47fa-9542-e7a7e995fdb2.jpeg)

# Conclusion
Image is a delicate piece of information shared between clients across the world. Cryptography plays a huge role during secure connections. This project focusses on only one of the most basic algorithms for cryptography, that is the XOR based algorithm. However there are many encryption algorithms available which provide better security. The project is open to further implementation of such algorithms.
