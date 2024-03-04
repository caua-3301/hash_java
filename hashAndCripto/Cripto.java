package hashAndCripto;

//lib que possui referencias para algoritmos que calculam o hash de determinada sequencia de bits, como exemplo o MD5 e o SHA-256
import java.security.MessageDigest;

//tratamento de exceções

/*
*  NoSuchAlgorithmException é declarada porque o método main pode chamar métodos
*  que lançam essa exceção ao tentar usar algoritmos de criptografia específicos que
* não estão disponíveis no ambiente de execução. UnsupportedEncodingException é declarada
*  porque o método main pode lançar essa exceção ao tentar converter strings em bytes usando
*  uma codificação de caracteres não suportada.
* */

import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;

public  class Cripto {
    //as exceções estão sendo declaradas na assinatura do método main, isso quer dizer que ele não é responsável pro tratar essas exceções

    public static String setHashCode(String idEmployee) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        String StringIdHashHexDecimal = null;
        try {
            //pegando a referencia (instanciando) um algoritmo de calculo hash a partir do MessageDigest com o .getInstance()
            MessageDigest algoritmSHA = MessageDigest.getInstance("SHA-256");

            //digest calcula definitivamente uma array de bytes criptografados a partir de outro array de bytes (input.getBytes())
            byte messageDigestHash[] = algoritmSHA.digest(idEmployee.getBytes("UTF-8")); //padrão de conversão "UTF-8"

            //classe que fornece métodos eficiente para construção de Strings
            StringBuilder hexStringHash = new StringBuilder();

            for (byte itemByte : messageDigestHash) {
                //"0xFF & bItem faz com que não seja permitido valores negativos, e o "%02X " indica que para cada byte, deve ser utilizado dois "caracteres" em hexa"
                hexStringHash.append(String.format("%02X", 0xFF & itemByte)); //append adiciona algo a String
            }
            //passando para String (estava como StringBuilder) já que não precisaremos dos metodos do StringBuilder
            StringIdHashHexDecimal = hexStringHash.toString();
        } catch(NoSuchAlgorithmException | UnsupportedEncodingException event) {
            event.printStackTrace();
        }
        return StringIdHashHexDecimal;
    }
}
