package com.example.projeto_samuel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class investimentos_curto_prazo : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.investimentos_curto_prazo)

       /* val imagem_dois = findViewById<ImageView>(R.id.imagemDois)
        imagem_dois.load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSq2JqGJGv2ahLFYmLVc20tlAAP_UdE9_Yj5euf5lvuGAPExXD38vmifmx7AF9xhG6LX20&usqp=CAU")
    */

        val icone = findViewById<ImageView>(R.id.icone)
        icone.load(("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAABYlBMVEX///9fJm3/u5j50zX/yqbywwD54n1fzf8wtv//wJpfH2lQxf8vuP9hFWFfXphf0/85nub/z6hXG2v50zZcIm5SAGK1eINUEW/91zNaHGl3S4J9U4n2xwDRq0hYGW7Zr0K1gYtVC2R2Q2bkvD3/6X5aH28/ldpfl8vVydj08PVfp9rBsMZREmr/xKBFh8tRCnCoj6/p4uvqqJKMU3jfno9mLG/f1eH2zCL54HP39Pi9rMLKu86wmrbQkYudY3z0sZWRcZqegqX510j52lmJXnHtxjqKZpRrOHh4P3OpboDptJ7HiYjUoJbLjIndwXqsiXXElDC2i1KicUlyP2e/lU6Ya1zHnkuNXl/53WargFXy2Xx9TGRtNmTkyXuTWnqgZn2FUleTa3K9nnjktRW+jjbZqRySYVLCo3egenOre0PRs3jOnyikgHSJXGKgdFlyO1+PZnKZZ02mfWBfhLtXR4rgrJom8MDKAAAVCUlEQVR4nO2d/V/bRprALQjsmb29O4YxsmxQEMR79lk529hyazBgb4plICRNSEgTEmjz1qbZJNvs8v+f5HnR6G00ko1F7sPzQ9ukBuvr55nnbWYeZzI3ciM3ciM3ciM3ciM3EiGdSqXSSfshrkA6lfJWfWCCHBGp0OtW2/9PUDvtbs/M5TRFkRhZUICW04r97UbazzemdLZ7pqa52NycGijU22k/ZXIpD5RwOkoJNKP7TWqy0jVzkXhYQG5QTvt540qjr2iCeCNRcoVq2s8cRyp9ADwIsKTKcg2LLOtqCXpeoJnfDGOn7jZPWNJV4+TZ89PV2/v7S0v7+xu3V598/tmUdNVNqZnfhq1uS6x9QlUe/vL6wU95JLO2oP/87s3HD2eSXGJevJAbXH+f0xjkWBdSGz588OLOT0sIzS3571ZW3vz4HsiMJhVlK22CCNlmAjtU9V8ezN+Z/2kpAM+WpVmLcWXu7RmrSK1YSRuCI52eo0CoD19bePPf/y2ED8l3c3MrK+/eQ5Vxq9tpc4RKo+CsQHn4q803/xOXz9bjnM345jFw9Jirp00SImXHQlU40l+UArGpIsb3NboetcG1TMq3qIVC+bcXNl+kAjGjjWjb6ktqqop5DRdjnQKqJw9GfPP3gjxomKXajB8gMVVFunZhwwGU/z6PAKMt1G2pFuO7LypFvGYlR58AQvl3xBcDkFrq3Mrc+xr5Rdq10iLVoHryCgF+HxYE+YhzK29JKrcArhFilwDq/0D6iw3IIH6UMKJiXBt3s03CoPxbYkAG8Z2B/Y1SuCZBo0E0KP8dL8H5BIAM4puXGBEM0mYbSceAXsBwJ5NfWsqHxhA/onYtspuBQkxUAPDR+stPG+Fhco4gkk9NuwYV4xZehOoPBPBeOODXGoQlGIq4RBHfEY+avrchixCszxMvEw64MeptqM/C7ZQifsShX0l9KRaQjULzxXykl8mvjsI5XA9/CVmKcysfZISYS7l708U2Kj+IXoQWoRxFSJfi3Mp7ksClaqcV4mUeEkBeOSFCSO10bg57G9BPk7CHCEvrd6JtVFCHjp2+07GdppiDt7GbKb0igPc4zy5GyNjpY2SnSjE9wiJSoU5tNNyPihNSJc7NvUR2mkstKJaRCuGQaDCiYhLU4RJV4o8ydtRpEWIV0oqQ42bsZvDSLCVEkg9O4Bxns3JWSlWJbRQpoONmwlSYX1r9/OlsfR1bnbGO5IfPq7OBjI6zqaW6ErEjrT2IyGby+18NWS1BS3CEg1hU+WQ1AJFR4jOkRC0Vd4pjIfwhQoX5J94dGEZg7XkQIiXEEUNJJSbilNtZhSEqfFoLw0M//9mP6LjTlZ+REmEaiU1hpBh4Qh3pvUANfpK5gBbiaYAWHXeKYqKWQnaKiwr9NTedyX+OApSg4f9BX0xMo8Soo11e+ILnZ/KnFLAk+wQX8vIjnxIZX/MBKTE3fTM10HM7fibISJdwfJBU4/PpqkdOn6GHh+s8M30jp2SmxEh/5Rlp/glWYe3zUj5AniIt1gIIHV/zJSUzrWro4ea5RnoGw+xw9L/3kZut7fuV/53XTOG0CVH/CZ5xjRQTlJ6GtC3ymDDIRzkhEb1o6kHfRMvrNS/cEz+jhrWe8qO8E5q8oE+8qTblDf6GN2MLXIaP1FBPgl5wW1ZhqRYUEJmF+H60WpXedAnLaBlK/FjxVeUaqd19e7r+KSg1ZRfi29FvWShMl7A7iobwB6rCoMKJEAbkZfQl+egS6h2uEqcbEVFdAX7jOpr8c2SlZ4J7wW6h6/ANCr1Tbteg4lfnOhoaDmGSjRrG1awjVzPVQygd5Erl37n9i/wGcvRqUIUUScjUFyNC0J0mIa4NVdpjC+ki4qQN3k6A6BD+gZzpVGtEnLMZ1JXOBz4kXogSlE7D99RCxJfVTDdcoEYps1nxfUhaJmGRP53uL7lkNoLZFy6mm5miPiJT/Ya1aB6R6gnK9sFZR+D609N9HiNDiJqKcKoBEe3cw5M7EYSzs2fs+VFWYEk2nweeyvQR4p22qXZNMeF6JGF+3whDtI8vmoH5DCKcTZWwKkpoIZ6ooYgSrAXXVYGExjRPZgjr0O4GP62FNhOt3D0MMWUdiq9Dm3F1vRbeMZVDDDVlwjImjPKlGDF/++vLkuoSmdguNPwV/ogwXV8qGA8Zxvzs/gYrq1+JC1KDSw9/PJzq5oVgTuPDZGX/E1YjDFRiyjlNBTVLI/NSPjDuJspPuBtQ6eSlpLZwmhixTpNixCXcc/0UUeSjvYvp1hZi9WEkIurjSGogoa8+nG5PGNX4Kr/GjyTc4HQT2Rp/RDjlGr8u0qeZRd6Fw4gJA7uN3j6NMt0jw7jXZnB7bZapPXn2LLBXiP836XlztxDT6bU1kDOt8Z1p/lmtVKqFNhPztzlW6uuXTnvjQqjnjQhqYQUEaQEoQj3v6bpSum/B3VzDvjKsEZXfR8lqKfA0JlXhm5T2LfAuPnfvCesomMAKh7g6Dtrm9m+RLkz7VDvO25xzCgELkcQ7uBG0ebhxRpLvgKyNcTRnaW1zYwv7B8dMiSeB5pPbXjl9WiKb3NzzJnNkD3j6d0uF9vFJv1QN3cSX4MsAT3ot9vHbAmcx6C43R+SgbjFjpCfISNM492UujFRAT7AHedOl9fA+FJJaYGHhHIrC9X0KRkqPeHPPROU3IKdHY3dRAzMeRoX4YJuSxpkovA1c4p5ry28Y4a02KK8H738z59pwTtBLAVDwbGJ+/2ngwb3RwcQnwYcvGT/zHp9NTOeAKc6+S2f8IjG/8fzMAKP2E1mUqqq8PHt+O6zj7Rxmx6FCmXLWTaWwgJQYcUbYCfLkjPAsM0KCq0J8MjG1G/rknLfTVJzMOW+qwo9IhQupnfOmZ/VfT/SsvlPdf4HpqpAqUYKvhJQoSOhNZ1Jbhbb0vBGDez027p0ZnBClc8gbS4Pce3odfSEh9r0nnNSmFAuJ1DXs/yd2d42q8A9yAzHlO5Ymrh6GtMYYi9Cx0bfk/mHaI3nI5S5AG4ucizMbvJp/BOi/Q5ritS4s5I6l/ovAPeCnsp2Nck7X0GSGXHVO5RqCR4q+W5acpfgc1E44gOS6+hy5rn4t5g1VSDLtIHKuAvOa4PQ+/tzJtbqPT5eiECJHnIEDX8jYiPQXIZKqD3GsuRh0ooJiXpO5GMxsE/kXkdyGD0gHf0B4jca39LFDlfSzF2POp/mR1svKNLK1TqO9Xd1uNyKtpUcQgfEgCSKZMbTymHbnpnFxtNwzQU7TtBwwe1Fv54xRUh8KFYtuwYBvzijgFBoXVcMZILugaGZEZKKIkr6OJyndE1UgmfX11pn1dfUm2i6wEx5HVlPgf6pdZ15b7WGseW2ziO+do0DFvHInsxUwIXchN+B+sFWN9tT04a93Ys3cswz0cYl2j7XCWLlapdsrFnxS7LMaqnsViD9arcf7bNsS/VigfvL7iDFqKh2emzj3QXL6qrneOHyZuqIpC9AniqIVqIZcgK5mp5Lrcz7ezkBzfgzPhuSqcQnNvnzzGDCzL8c8VlLUpDChYzW3nRWlGsOToaQzlEDpcmLHFmDml8rmw1cR80tt9X18JjN9ca0w3hIceCcYuwR1RBrkNVDdbe3NzMzs7ZyzjNyRxo0io3+oqusPX925cy+Y8Tsb74+X7HxWJTfmdn01eH3R3z9qTJLRVmC4mc3O2JLNbjbdjJzQseWaUg5VMPzt9xf3XEUFagivvHvys+SeCZ0bU4Hkhnm42HkEaRGqFwgPSbbVZLYfYK4Q7lY7ffckdgjkWuns66PVjX0it08f/fFFr6nuvbfImBsteJKFtPAXn6AGvd3Xwh1C4AK09bgz1Bl153rhjO2eb9q8ZbByraZIhmEsqDVZ9s3zljSJt8AFBV/elf75P0T+SuRfCNHMdNBr4HDGK9mZI8gsYwVw3Gq7JzxyHr2dxnVgwoJ6Kgv/8Z9E/vzvRP7rL+ityBBEsJP1IVqMyy5GrR7+VI0+jP7aAIynxJrHXmmXt6tb1a2t6vZ22VMUUMI/Yfnzv2FxCOvosYYBgDbj3gHLqPHGb3e2Rb4bwbJ3sy+UhHYq5W6/KNnfAKIRsf9gDupb7Yo4YRFdhTsIJrQYN3eF3WqmsTVQcmAhnE6z8Moi5tne6hU07/eAkN9i/RpQ6FcbYoT4wFqQkVK3OmQYocbPyDvlbsH60IHi3tG3nyqnDbZEogP+HpDwD2r0HIoGzD5yk3xC9C+9FQpoM+4MmSxkIVeMsrL2dn1QMA2oAE0DVtpjmMX+Vlkove5sF3OiC1rCKhYjDNfhyOUcmwyjFTqEdNFoNNrtdqMh/nVB7T4QxmM+8zGtFDMuS6xbVepX0JyuFsJiDq4XEhEORuYe7mkYxgOVYbQy8snidbqG5l16lpmrKgCSORw2LRmaENh/4UXlE3bRp2ZGEtqhYxewblWa4Gn6SlfTPHTAKnR21+5fHt5adOTW4eX9tXOr/GGfhE9IIj5/IRJGd0Ye1egQ56tDNx/QjfO1y7sjJo+MQA8v15oWpRBheNYWzNhyZatapFtNwAfk4drlLT+bh/PW5QF2DXxCmnlHr0SEmN0xGQtRxv4ilUo/xxaxUDXXDgNUF0y5BgQISfWkL4sh2hm5wbpVbqMjShp9jeUD8Py+EB1mFCKkFbB+vifKuOfKyPmNjgg+NjwA5eAwBp8wIZ1ADsxNQUSL8cKVrRpJdt8bPeDiA2u34uCJEzrfxQHFPCpmbLpDR9x6veEuKYERm0+ckOkmBpaJYYwtd+goxgkdnpLZci/x+WIQMpsQ4CgG4oy70aEJu1VP20OVEvHFIWQ2IYRdKmJ0u1WtJ+JW20WWD6rGUTK+WISZMiRvqgsGRsK47A4dkRl5eZBz8Q0T88UjzDQK5H3V3RiEo0YH+815msR1q24+SR8eJ+eLSZjp0A0A0IyFaDGeCzY6ym771M374/DFJbRCP0UcisZ+wrjpCh254K/9K5se+4yTvkyE0DmAUBoKx37C6MrIYcDW43Yhx3wIUD8Zmy8BoeNSoREb0dPo8Gw9WnwLLN9wTPtMSsikN1A8vaGMnv5xn2arVVPz8I2vv4SEzvcASXqM9IYyHrDNHKCNMvJO1XDpT21ejsV3l0oiwkyZPmKc9IYyehodRrVi6U9i+PRzQT5fjXj3ru95sssJCDNtegABxElv6Jt6th7d31Kqi+pvcfH+wcEleamfbRzCTENKlt7Qt20NgwfwKOq5YPm3eOu+qQOgry2G041BmKnQ9Ea/SEDo3XokFqHsHootP4sP7yOoh/yPOClhplIki1E9T4JoZ+Smh0+9EOY7pvskUeskMSFzhCNuBkcIl918ujDf4pHp2PgVEjKHD+NmcPYbtwx3e+nirqj+jiT2hibYjHijMQiZw4fi3Rv3+5KnlA6E7XPNYNcvVKPi1ViEyTO47DLzmADE4GPTPjuyRKZV4xEmzeCyRzrDtyZsn2tsOmTzCXyuYxI6GRyM0aDKtpykSLh9ZvEpLssunQvZzbiEdMa1FTXEM7gh+dJNSVh/h279AXVXcF2MTZhp05MCog0qaqNqU1R/dw/cfLoo3yQIMw0jZgaXNfBzXojqz7Xvaq3c3RjRaQKEmYpJEYUaVC2kQjgU5LtQPZEzVvSdBGGmU6AZnEB6kz1Ar5ZFQoTFB118ykHc/tAkCF0Nqui3RH4GNqMBFw/Pgdu/xOWbGGGsDA4tQ3UngnDR4pNdGzPSwUyCgntChEwGF5XebOI1exjBd3muuzeeluNnv5MkZDM4fnqziYKhGsHXdG8cSsn4JkkonMFFE9p8bAsAAricwD4nTsj04NRjzvPsRVjp4q3Lpsy2OFQjOd9kCTNlelZQ52RwWVTag7VAT7O4eN/VprL4jhLa5xUQMhmcGp7BZZsoWgwDCC0+d4tKN47G0N/kCYUyuOwRCnH6fS+i014i6888yo7HN3FCNoMLbVDt4cTbcNcVPj59OK7+roJQZIsRm6mknDClxeKtIxefvTE6Ab4rIBTJ4HDqLSkm6W6722ejjdGdifBdCSGTwZnBXjC7S5JNuXnfBjz0tJfAcGfs9XeVhM7Zm7Ae3J7hKEs1h4bOptdQP5kc3xURRvbgsi1/R5/yNcewzywrV0noZHAhx26zx8GIUG22EurP/rHW8fLBuX0Wurl7cLSzOfrLKyKM3EXN7gScOQfgPPauMsHb2zkYqroKAD7QDoD1p+HF8d5VEVoZHH3uwAwuu+ndewLwIm7nnPyuveMmdLU6iEkAFTRRbJo8YaZNt+XDMrgjQ3e+0lmFCcujbLa1a4R/G4iE3+IKCDMVJ4O7CA4a1rOZkj0+EUjN40TLz7LOZUOPGoh6VYTMLmrYITHL4W22bNlLxre309QDjHNqhKKHxJI5T8sCLvzWaV+xtwV4L31dDWG8Hlw8vL3lIXCrb8FmM3v1LVu6vSK0Oa+ccLxd1FC+AOsEmtnfdp/OrZS7RXpp9coIozO42HjZ1oGhu61TyZnd4GsrlepA5HbeWOJkcNL4iJZ1HnmtE2q5Hu/OafeKIr4jzkgDNWHGQvlmds4BcKvPss4t/k0OkVuyY8q2sx/K68FF4m0GWWc98lLVFAiZXdQk5+BGeJZ1nnh9p6ZxrdNHSORP9D7+XydFmGmDuLuoHr7WuQR86tsSu0uFi4CFf/43kf8l8i/0uyYxk7hhRmRwPLzNA8lrnZohdl9/9N7YggLmYuDfNpHvxWLOwcU55m9bpzf0WZG8tx3nmlhBkbgyoRlpSY7529bpTcyUXEHowj4j2xHzaSY2dZk95i9mncuGd/Fpirh1OtLTpHBZAJMbkkaP+UdncFm7qPVZpzJIOKymF65FRZnkmLu64C5qdqa163MuuUI3+V3bLUlTgkQb+wKvR5gMLjS9QWWDu6i1qoYk1slIp9ov+mUQks2OIWTejx01Ai01O3M81L2RHRSvw2BdQXF6cMDeF/RMZZppXUh+3zmGdaYhZYUSqMZFC/Vw0T83l4eqT339dL6oYxxh5gxKABjN5eOdVmvneLlp+MqGXKF6bWbqxpGK6dqlAKpuieqhs5yLWf+2rJORzoCfZIysM3L+6/WWqmeIh1ts67wGY9fHk05dC+lzKpr07VqnSyp10z8syML7xq3TJZ1y38zR1q2dQcHet2+dXmlU6wPTKvigWaxvtb/J0HAjN3IjN3IjN3IjN3Ij05L/A1ya/RcEdQ+MAAAAAElFTkSuQmCC"))

        val imagemUm = findViewById<ImageView>(R.id.imagemUm)
        imagemUm.load("data:image/jpeg;base64,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")

        val imagemDois = findViewById<ImageView>(R.id.imagemDois)
        imagemDois.load(("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRV4kRWnh6gVYXZ733QVIgPnBzC9fgwWY4Mgg&usqp=CAU"))

        val imagemTres = findViewById<ImageView>(R.id.imagemTres)
        imagemTres.load(("https://icons8.com.br/icon/13132/m%C3%A9dia-2"))

        val imagemQuatro = findViewById<ImageView>(R.id.imagemQuatro)
        imagemQuatro.load(("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAoHCBISERgSEhIRERERERIREREREhERERIRGBQZGRgUGBgcIS4lHB4rHxgYJjgmKy8xNTU1GiQ7QDszPy40NTEBDAwMEA8QHhISHjQrISQ0NDQ0NDExNDE0MTE0MTQxMTYxNDE0NDQ0NDQ0MTQ0MTExNDQxMTQ0NDQ0NDQxNDQ0NP/AABEIALcBEwMBIgACEQEDEQH/xAAcAAABBQEBAQAAAAAAAAAAAAADAAECBAUGBwj/xAA8EAACAQIEAwYDBQYHAQEAAAABAgADEQQSITEFQVEGEyJhcYGRocEyQlKx0RQjcqLh8AdDU2KCkvElFv/EABoBAQEBAQEBAQAAAAAAAAAAAAABAgMEBQb/xAAqEQEBAAIBBAAFAwUBAAAAAAAAAQIRAwQSITEFEyJBUXGBkTJSYbHRFP/aAAwDAQACEQMRAD8A8uEkBGEmomkOokwIwEIolSnUSaiMohFEIkok1EZRCKIQ6iEURKJNVlQyrDpSJ5R6K3M6nhXCRUFrgaE7E7G2w1OvKakZuWnLGmRHCzZ4hhMhI5qbe+v6TMywm0UNjcTe4djLjeY1emFpl+lr+5sJn4HiFjvznm58dvb0mWtuxxGKYbQDVWO+kfh9QVFW/M2/KauI4coY+s8e9fZ9PDKM+gjNzhqlfu9CZcoPTpjW05btFxEMfDExuVZzz0PxWqGGkygl4XhiNUGs0KOE8VvP4Aakz28Fkna+Z1Utsy+zMOHMA6WnV1OFfu+802uAScxF7Xvte/KYeJpfWenTyS7ZpWQZZYKyBWZWVXYQTLLLLBMsNK5EiwhmWDImQAiQYQ7CCIhQSINhDMIMiFQtGkrR5GgwJNRGAkwIEgIRRIqIRRKykohVEiohFEIdRCqJFRCKJUSRIcUzL3C8KHOv923M18fwk0wt7eMX9Pl5iakZuTnaehnRcN4pkHQ2tqARr5Hz1mHUSxkGqBRqbR6LNtbiGLFQnckm5J3J6/nMxmsLmUK3FkXbWUK3ETUuNlG5G9unrJclxwp+IYtqhIDWQGxJ29PM+QlfDI1iaaFwpsz1CEpg9CbgA+RMfIqqKlQZswPc0bkAi9s7kahLg7WLEHUAXgiatdwtmqNayIi+FV6Iiiyj0ExfLvj49Oh4ZxU08uarQFm2UFrbc1Qj5zo8Rx4O5ysji+gU2b4aEzhH4U6qpapQQliMrVULDbcLe0hiaT06hByuAftU2DD4j6icsuPbvhy6dPjuJBrhWKt+BjbXoD19Zk0aT1H1B0OoIN/SXeF4EVVBY51Ft/tp/Ty29JvrQSmtjYsB4T1HIfp8JxtmPiO2rl5oVILRp352mThuNr31jtf89CJncb4uWJVTOeNQg3vrOnDjcb3Vx5splO2PYV4gO6yqAbi19bW8xtfznPYxhy8z7mc/wfjNxkc+k2C2bXeeve48Hbqq7LBssvUaOY2l6twohM1jY6A+fSNJtgMsEwlusljaBYSLKrMIJhLDCDYRWldhBsIdhBsJmqrsINhDsINhCwK0Ue0UgGsIBIrCLKtTUQiiQUQqiGamok1EiJGtWyCBZEfvFHOYr4pjAtUbmTHcva6/AcWp0zqf75y7xHtajKADfKPCAABfqbbnQfCcDmjXjuq/LjXxHGGY6aQOHxAqG1Ryq2Oo1I8Jtp62EoBD0PwkWEm2+2E+/wCm15ewNEMyq1wniqVCN+7RSzW88qm3mZQE0sL9iqQf8lF+Nal9AR7yLT06dTE1gqqO8qOqIo0VRsqjoqgAeglrHYpUvQw5tTHheoNHxDDdieSX2Xa2puTDdnxlFeoPtU8JVKHmGcpTzD2dpnYB1WqrMMyq6ll6qGBI+Eqfd3HZXsFUxFIVMQKlFCGanbIGdjbLdTqF35Cc12n4RVwmIKOjIT4lPJl6qRoRPYOK4ZsfRSpg8UFANwFd1HocuoPkROI/xQrYsCnTxNKmKaN+7xC3ZqhyWZWN9CdDaw+zLZqMy2/8/DnezL1C4I22I5ETpOM8JqMnhLWtmQ8wDy/vpMDsrilDjaemqA1NT/EPbT9Z8Hq+rz4+SyT0+rx8ePZN/d4txbh9Sm2YjRhmPkefzBmU89T7VYVO7vYc/pPLa+jG3Iz6PSdR87Dby9Rw/Lvj7klNgO8FrBsp630/Wa2C4qyaNqJjLWNsutibkaa++/IfCTvPXK8upXc8O4ghIIM6CvxNTTCaWBzDTW+vPpqZ5jgg9yVNsoJ3tsLmaGH4wQcrcpuZOWXH+G3iDc3ldhC4aulTYyeIpgGwNx16zTKmwgXEsOIJhIsV2EGwh2ECwkUFhBMJYcQLCRQrRSVo0KGIRRCIidT8P6ywiU/xH4f1gtV1EMglunSpn7x+H9Zap0KP4z/1jTNrOUTNxzeK061MNh/9Tf8A2nTWUeIYHDg3zn1tpLYuOU2wcAis3i0F1BI3AJ1I9Br7QvFKKI7BGzoGsjXDXFgT4gADa9rjTTSaTUMMCMtRh4RfT71tbW5RzRw7faqE+oJmdN9znLQ+GpX5ZiSFVerHb/3/ANm7+x4X8fyl3BYXCAi9Q6Zr2HJlK39ReO07mOvDarUmrKjvSQ5WqKg7u/kTqQPxctL7iZ9encX5/puJ6PhWwaYU03csVp1ETwDQOxN0qCxC3Nypvf42xa+AwqjKamviNrbXAAv8PnLo7nDsplzAuT3ia3qUWtpe7IyVLe4Rh6kToDw/C/6nyhEweEDh0qZChVlH2rEW1131ubecmjuUez9Qd4abEKmJo1MOWOys4GRj6OqSjSTuqwFRCe7qDvKZuL5W8SHpsROsTh2DtpUC03N1NiRTfmp8vpYy5jMBhKthVqZK6qB3pUlai2spe3O33xe/PrGjbqqHCMLiqNN8BVSnTV87JdyymwvcE5lO0xf8WOLUv2ZMIrirVzo9RgbhFVTbXqcwFum/n0vYjgqUKGfvA4qMwTIwNMpoL6b6iY3b7snh7ftKk0gCq1F1ZddFK9Onwi0/W+vTx7huLam4Otrz2rAVD+zoDe5TOf8AlqB/1yn3nFcL7O4XMtSqR3ecGmDcNVKnVAOa3tduWw1M9FwuGRlLZwSfEx0G/QdPKfG+KYY2TXu/6e7p+TU8+o8/7aYwqlvU/T6TzgsefOep9s8JSYHxi/SxP97ThWwVL/UHwM9Xw/CY8M0x1fJ3ZMVBrLRQjkZq4bAUtTnFgM3O9rhQL26manEODU6Ko3eI4ca2V8hOh8LahhY+vlPdp5ZXKhiNjIma9XBUwxHeJvb7w1+EA+Fp/wCov836RpdqlLEMhuCRNXD8Xvo8qJQp2N3W52+1ob+kGcOn41/m/SWbjNkrfSurjQxNMSl4DcOv8/6TVwmJRtC63/5fpNSsXHR3EC4l9qK/iX+b9JFMKGdUDICxAF8wFztrbSVnbOaBaXnpAE+Jfn+kA1MfiHz/AEmVVbR4XIOo+cUKqLCrBrCLCiqYVTBLCLCDKx6wGPc5d4dZQ4m/KKuPtnlz1jFz1iETCZddJgta+towqMNQTJftRyZOQYt72t+UFBFlMfUH3jf8X3h6Hce0ia7HcmV44MA5qN1MgKrdTHRSYz0+hBgWsPjHXndW0ZTfKw/XzGsvUMeQMoZXTfu62wP+1ha3sV9JiK0IWtGx9Bdnq6rw3DEKVBSmcobNbMLnU77xdtcQBg65sjFKOdQ6q65lswJUix1HMTOw1A0uHYdA2qCkpPWyC8XafxYXEC982EqDXYfuzPJ8y938PVOKXH+XlWCx1SpiM7uzubAsxvYcgOg6dOU9IwVQ92NeXxnlHC3tUX1nqXD2vTHpPmfFpdyvV0Wri5jtXRZwdTPPnZgbXOk9e4lhM6EmebcYwnduT3b5T97KLH5H856PhnN3Y9tcut45vuihha9jYnQ6e3T5XmlieINUADvmC62AClmtbM5AGY2sL72EzEpg7f8Av9+p9op9Z8/Sb1CTcnc395EsY0UKWYxsxiigK5jo5BvGjQOjw7koI7mAwDXSHab+zjQWME5hWgmkohFGigBWEWDWEWFFWFSCWFSEFWY/EWJea4mRjPtyVcfauojxRjI6mZZFDJRjAciKWeH4KpiHFOkjO55LyHUnkJ0X/wCAxthrQzH7mdrj1OW0xlljj7rWOGWXqOewu3UgMfcAW+p9pp8XoU1Wm1O12G2fMzDTxGxI1JYX02tbSdvwnsBQpUc2JLVKx1OR2RE6Bban1MNwzsVhu8FQl2VTfu2sVbyJtciZ+dj6dPkZa280Xg+JdTUShVanrZwhsR1HX2lWmhLBCCCWC2I1uTa1p7/iaN1yjQbDTQTn14RRTEI9SjTZu8UCoVBIOtve9pz+fq+Y6/8AmlnitriFFhh1QbK6W9lmZ2pYpgcQ7c8OUA82UL9ZuY83Qjo6/lOe7eox4dVy/dFNm/hDqTOM85T9na+ML+7yPDvlcHznp/Z+tmpj0nlV53XZLF+EC85fE+Pu4u78M9FnrK4uydAQbi+Vb2O1yQPr8pice7P0auHZsj1KpVnL03Q1KbICQvdnVlOl7a9JqviABr0seWn92+EyuLcXqLSK01QuFK06mS9SmpBBC6bm+/KfO+HZdvJLfTr1GFyxsjy7Bi+Yf7c/uLX+V/lGqb+tj8RDimKYZT9tvDYG+RAQTmP4iQNOQvfeVnNzP0j5ZooopQooooCjGPImBtcKPglt5Q4SfDL7zc9ON9gtBvCNBNJQOKKKAAQqwQhFhRVhVgVhlMInewmRiGuxlzGVsq25mZl5LWsYcmItFliCSOhrxjJd1JhAIHqP+GPDe7whrsPHXckHn3a+Ffa4J951FGoBUsdyZS7IH/52H5fuhp5XMp8brFXUqbHvKYv6uAZ4OS/W+lwz6df4dFiz4TM3BY4U2yN95go9TL+MqACcbxuo3+X9oMGX1BuJi/1N4zcdvXPnYQBpBgA2qkqb8wQQQflGpv3lNHH31VvQkSxh0ls3Ul1BMUEyG/4gd5k9oFFXCV6S/eoOB65bzOxnFDmemLkq5X4EiOvEVUNnbxOhAUb6raJl5Xs3i8ew9F6jBKas7tsqAsx9hPQuzHZivTAaqy0ydcg8TD1O35zU7N8OoYVLIBnI8bm2dvfkPKbBxa30PpN83JM8e3Xhnh6a4Xuvtl8WwVSmhqKcyr9ojQr5zjOI4lipFzY8p6DxbiCJhnB3dSijmSRa/tPNuINoZ4sOLHHOTF25Mr23bnn3MgZNzrIT7OPp8e+yiiimkKKKNAeQaSkGMFa3CDpNBpl8Kaabmanpyy9hNBtCNBOYqIRRRQK6wiwKmEUw1RlhVMAphAYZUMc13tBCSrHxGREjrjPCQiLQbPGzSbUTPEDeDvJAwPY+zGIvgKFvu0lX4XB/KUeNOboTyqIT6BgYD/DrFiphWptvRcgfwv4h880udoEBUkbDWeDkmsn0+Ky4z9Glj+IDawvzvOcxjls7DcKxHXQGaFMCrTV762yt6jSQw1AMxU/eBX46TF9ukrT7GYzvMKVYktTdhqdcp8Q/M/CbtGsL/ScH2WrtSerTO5X+ZGIP5zew2PzPz36i3ylyuqzjjtT4mgWrU2UZ8xJ8xf6zm0cmoz3JvoL/AIROm45QLO/R6YI/i2+gnPmi17W1GhEzI671FrDVmvzkuIcWp4VQXOao32KYOp8z0Xzk1QUqD1qhsqU2YebW0HxtPM6lVnYu7FnY3ZibkmduPimXt5+bqLjNT3XXVOIPVu7m5PIbAdB5TK4hU0gcHW09pXxtS8548WuRnPl3htTJjRRT6DwFGiJjXhDxRrxXgPBNvCXgmOspWhwxvFNZzMXANZxNgmXFyy9otBNCOYFjKiN48jeNC6AEIDBAwimRoVTJ8oJTCKZWaz62hMEWlrFpY3lIzLpL4K8kJGSWBJY4kSYhCuk7F8T7nElCbLXTL/yXVfj4h8J2uJxK1AV5HSeSVKhUhlNmUgqRuCDcGekdmWTGU+8ZspQWdQbENz9juJ5ubDd3Hs6bkmrjReHVsgemTscy/X6SeGxoVxc85Q7VD9lNNw4tmynq6EE3+EBhXzspHivYi2twZxuH3emZTemnV/d4pm2DnOP4XGv1+EPgqVQ1Cqjnrc2F+kz+2veJh0rroabBHVha6N9k+xFveU+E9uKaqO+VlqC2ZlXMrEC1xrcG018u5TbF5ZjlZbp2PEQwpoW0dGKOPIi4/KZGOx1KkO8qMF01B3J8hznN8d7dPiSEoqURR9p7F2bqQNBOXr13qHM7M7dWN5vHh/Lln1P9rX7RdpnxI7tFyUAb2+85Gxby8pigwLiJGnoxxmM1HjyyuV3V2hVtB1HuYBntJIZmYfVtq5fTpOMTFIkzbCJMlIGSEIeNFFaFNeDMIYPnCLWFNmE276TApHUTaVvCJqMZHYwLGTYwbGVDRSMUAAk1MGDJCRoYGEUwKmTUypUqqZhMyohU6zVUxqlINJYS6ZEkIWthisA0jZ7xxBrJgwI1xpLGB4lVwxLUqjUyRY5dmHQjnAuLiDqJ4b9JLNrLZdwXH8RrYhs1V2cja+w9AJsdn+0QoAJUBKropWxNuhE5qPJcZZpZnlLvfl2Hartd+2U1o00KUwQXZrZ3K7Cw2UbzkGjgRWiST0mWVyu6JQEMYNBYSd5UM0FCkwbQExhV2gAYZYEiZCOTGvAcSUgI94DxrxooCYwYk2g1MAqHWbNFvCJiAzVwzeGajOQzGDYyTGDJlZNFI3jyAAMmIIGTBhoRTCAwQMkpgHUyamBBhFMrItgd4J8GrSQMIrQKT8PtqNZTqoVJuD1E3QZm8RNj6yWLjkoMRy5xh+ekTG9uVunORkbAtrJKJNrXufh5yF77SIcnkJJVtHVbRXhUgY95EGK8BzIMY5kGMBLvDAwCwimBMxorxoD3ivGivAe8V414oDOZBTJOYNTAMDNDBt4ZnCW8G0sSrhMGxkiZAmaZhoo14pFBkgY8UCQkgYooE1MmDFFKlEVpIGKKEoimUOKHSNFJUntl5o+eKKZdTRwYooEoxiigK8cGKKAjBGKKBaw1ENvD4qiqjTePFCqd4xjxQhooooCiiigDcyIiihBAZZwraxRSwq4TIExRSojFFFA//9k="))


    }
}

//SITE da toroInvestimentos.com
