public class Codec {
      Map<Integer, String> map=new HashMap<>();
      int id=0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
      
        map.put(id,longUrl);
        return "http://tinyurl.com/"+id++;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int key=Integer.valueOf(shortUrl.replace("http://tinyurl.com/",""));
        return map.get(key);
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));