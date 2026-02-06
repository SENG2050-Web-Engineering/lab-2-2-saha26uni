package seng2050.lab2;

public class HtmlGen {
    public static String Doctype() {
        return "<!DOCTYPE html>\n<html lang=\"en\"";
    }
    public static String head(String title) {
        return "<head><title>" + title + "</title><meta charset=\"UTF-8\"></head>";
    }
    public static String head(String title, String script, String css) {
        return "<head>\n\t<title>" + title + "</title>\n\t<meta charset=\"UTF-8\">\n\t<script>"+script+"</script>\n\t<style>"+css+"</script></head>";
    }
    public static String h1 (String heading) {
        return "<h1>" + heading + "</h1>";
    }
    public static String h2 (String heading) {
        return "<h2>" + heading + "</h2>";
    }
    public static String h3 (String heading) {
        return "<h3>" + heading + "</h3>";
    }
    public static String p (String p) {
        return "<p>" + p + "</p>";
    }
    public static String end() {
        return "\n</html>";
    }
}
