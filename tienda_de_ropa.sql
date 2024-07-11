-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-07-2024 a las 23:41:45
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda_de_ropa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `articulos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `categoria` varchar(100) DEFAULT NULL,
  `precio` float(10,2) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `descuento` int(11) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `articulos`
--

INSERT INTO `articulos` (`id`, `nombre`, `categoria`, `precio`, `stock`, `descuento`, `foto`) VALUES
(1, 'Campera de jean', 'Abrigos', 25000.00, 4, NULL, 'https://lavaindumentaria.com.ar/wp-content/uploads/2022/05/sin-titulo-13.jpg'),
(2, 'Chaqueta camuflada', 'Abrigos', 40000.00, 9, NULL, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDgD-icg2MiIutdpVqpqYL0q6JFdpSBn9g-A&s'),
(3, 'Chaleco de pluma', 'Abrigos', 35000.00, 13, NULL, 'https://catlifestyle.com.ar/cdn/shop/products/B2322045_10121_eac92816-7280-4331-8727-153c6d85ba1e_1800x1800.jpg?v=1570349421'),
(4, 'Campera de pluma', 'Abrigos', 100000.00, 25, NULL, 'https://www.doiteargentina.com.ar/wp-content/uploads/2019/04/doite-campera-pluma-eboni-hombre-negro-01.jpg'),
(5, 'Anteojos Rayban', 'Accesorios', 79000.00, 13, 40, 'https://opticapaesani.com.ar/18332-large_default/ray-ban-aviador-3025-marron-anteojos.jpg'),
(6, 'Gorrita Fred Durst', 'Accesorios', 25000.00, 3, 20, 'https://http2.mlstatic.com/D_NQ_NP_988000-MLA73460518083_122023-O.webp'),
(7, 'Bufanda escocesa', 'Accesorios', 6000.00, 1, NULL, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRUOB10aiZcUwgKeavFm1lWplSlC0Q86-LEfA&s'),
(8, 'Corbata elegante 3', 'Accesorios', 7900.00, 2, 35, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTo5Znpww59IVNkKnN-3WKfLrEooriPAa7Cyg&s'),
(9, 'Borcegos tipo militar', 'Calzado', 100000.00, 17, 50, 'https://http2.mlstatic.com/D_NQ_NP_857531-MLA54931140042_042023-O.webp'),
(10, 'Zapato de punta Ricky Sarkany', 'Calzado', 99000.00, 6, NULL, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVfSRert_hTDGdBhCoLSOPmwuwqDbRDa_HRg&s'),
(11, 'Zapatillas skater Vans', 'Calzado', 50000.00, 12, 30, 'https://acdn.mitiendanube.com/stores/768/324/products/xfgnxfgnfdn-9c15112e4900362f3717120658789468-1024-1024.png'),
(12, 'Zandalias abiertas \"las oreiro\"', 'Calzado', 50000.00, 18, 20, 'https://http2.mlstatic.com/D_783302-MLA73662934740_012024-C.jpg'),
(13, 'Pantalon de Jean Levis', 'Pantalones', 40000.00, 14, NULL, 'https://http2.mlstatic.com/D_NQ_NP_826316-MLA69334934510_052023-O.webp'),
(14, 'Bermuda playera Reef', 'Pantalones', 25000.00, 17, 10, 'https://images-na.ssl-images-amazon.com/images/I/61o00zHRjVL._SLDPMOBCAROUSELAUTOCROP288221_MCnd_AC_SR462,693_.jpg'),
(15, 'Calza termica unisex', 'Pantalones', 8000.00, 15, NULL, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3YtdFtJGvrrQEaFEzfQf6cojPhUqyasZOAw&s'),
(16, 'Leggins on-fit para mujer', 'Pantalones', 15000.00, 7, 10, 'https://m.media-amazon.com/images/I/4121aP5dwSL._AC_SL1000_.jpg'),
(17, 'Pantalon de vestir Pur Homme', 'Pantalones', 19000.00, 16, 15, 'https://m.media-amazon.com/images/I/51GoPHfXp5L._AC_UY1000_.jpg'),
(18, 'Camiseta de argentina Tercera estrella', 'Remeras', 60000.00, 14, NULL, 'https://afaar.vtexassets.com/arquivos/ids/155811/Camiseta_titular_Argentina_3_estrellas_2022_Blanco_IB3592_01_laydown.jpg?v=638091260626300000'),
(19, 'Remera manga larga lisa', 'Remeras', 5000.00, 21, NULL, 'https://cdntienda.universoshopweb.com/pub/media/catalog/product/cache/d7574f12538e546d58299d712612fd64/r/e/remeramlarga.jpg'),
(20, 'Musculosa de cuero', 'Remeras', 17000.00, 15, 35, 'https://http2.mlstatic.com/D_NQ_NP_941032-MLA50771800710_072022-O.webp'),
(21, 'Remeron oversize', 'Remeras', 14000.00, 22, NULL, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-HfaXmpCsm9up6ysWmXaLQ_GUHSyPL1LL9w&s'),
(22, 'Remera espalda abierta', 'Remeras', 9000.00, 2, NULL, 'https://http2.mlstatic.com/D_NQ_NP_672608-MLA52892882120_122022-O.webp'),
(23, 'Vestido espalda abierta Fla Cisneros', 'Vestidos', 125000.00, 8, 25, 'https://i.pinimg.com/736x/fc/a3/0c/fca30cc71c3a121113feae63f7a2174c.jpg'),
(24, 'Vestido Pour Noir Versace', 'Vestidos', 275000.00, 2, NULL, 'https://images.thebestshops.com/product_images/original/SL10519-007_01-87dcac.jpg'),
(25, 'Vestido Givenchy para mujer', 'Vestidos', 190000.00, 9, 50, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmP8vvK_VODuIEVHv_KxDGtLciBNZh-v1Bqw&s'),
(26, 'Vestido de niña', 'Vestidos', 7500.00, 17, NULL, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSITC4GdoWKTao0cxghv9Zw2rj70375u7CoCA&s'),
(27, 'Vestido largo liso', 'Vestidos', 40000.00, 18, 25, 'https://http2.mlstatic.com/D_NQ_NP_684887-MLA52720581199_122022-O.webp'),
(28, 'Vestido de novia', 'Vestidos', 300000.00, 2, NULL, 'https://dcdn.mitiendanube.com/stores/001/170/732/products/a0e488ae-3879-4bdd-9cb5-fea88e7f326a1-fa806164915d2530f816147231181782-1024-1024.jpg'),
(29, 'Otro articulo', 'Otros', 1.00, 11, NULL, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2HBxhOghLb6nXdGjqvSntIbYyyDuC_UFk1g&s'),
(30, 'Articulo sin categoria', 'Otros', 1.00, 8, NULL, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2HBxhOghLb6nXdGjqvSntIbYyyDuC_UFk1g&s');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrito`
--

CREATE TABLE `carrito` (
  `carritoID` int(11) NOT NULL,
  `usuarioID` int(11) DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `carrito`
--

INSERT INTO `carrito` (`carritoID`, `usuarioID`, `fecha`) VALUES
(1, 5, '2024-06-17 18:59:44');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallescarrito`
--

CREATE TABLE `detallescarrito` (
  `detallesID` int(11) NOT NULL,
  `carritoID` int(11) DEFAULT NULL,
  `articuloID` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallescarrito`
--

INSERT INTO `detallescarrito` (`detallesID`, `carritoID`, `articuloID`, `cantidad`) VALUES
(1, 1, 7, 1),
(2, 1, 3, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `clave` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `pais` varchar(100) NOT NULL,
  `admin` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `email`, `clave`, `nombre`, `apellido`, `fechaNacimiento`, `pais`, `admin`) VALUES
(1, 'codo@codo.com', 'codo', 'Franco', 'Deando', NULL, 'Argentina', 0),
(2, 'admin@admin.com', 'admin', 'Gabriel', 'Cerrel', NULL, 'Argentina', 1),
(3, 'wairey2@usa.gov', 'ifelhgqe', 'Wendell', 'Airey', NULL, 'Argentina', 0),
(4, 'akubach3@jugem.jp', 'ytdwdaqm.k`', 'Amberly', 'Kubach', NULL, 'Argentina', 0),
(5, 'drape4@comcast.net', 'dfdiblfcd6', 'Dominique', 'Rape', NULL, 'Argentina', 0),
(6, 'dlowings5@arstechnica.com', 'ctpkrcgsWNja(', 'Doti', 'Lowings', NULL, 'Argentina', 0),
(7, 'mdunleavy6@google.ca', 'vpoufexah6bBp0', 'Marillin', 'Dunleavy', NULL, 'Argentina', 0),
(8, 'tpersitt7@bigcartel.com', 'imxwimpp|ac9TOt', 'Torin', 'Persitt', NULL, 'Argentina', 0),
(9, 'mpolleye8@tuttocitta.it', 'mziyhvgaW}.F', 'Mabel', 'Polleye', NULL, 'Argentina', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `carrito`
--
ALTER TABLE `carrito`
  ADD PRIMARY KEY (`carritoID`),
  ADD KEY `usuarioID` (`usuarioID`);

--
-- Indices de la tabla `detallescarrito`
--
ALTER TABLE `detallescarrito`
  ADD PRIMARY KEY (`detallesID`),
  ADD KEY `carritoID` (`carritoID`),
  ADD KEY `articuloID` (`articuloID`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulos`
--
ALTER TABLE `articulos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT de la tabla `carrito`
--
ALTER TABLE `carrito`
  MODIFY `carritoID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `detallescarrito`
--
ALTER TABLE `detallescarrito`
  MODIFY `detallesID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `carrito`
--
ALTER TABLE `carrito`
  ADD CONSTRAINT `carrito_ibfk_1` FOREIGN KEY (`UsuarioID`) REFERENCES `usuarios` (`id`),
  ADD CONSTRAINT `carrito_ibfk_2` FOREIGN KEY (`usuarioID`) REFERENCES `usuarios` (`id`);

--
-- Filtros para la tabla `detallescarrito`
--
ALTER TABLE `detallescarrito`
  ADD CONSTRAINT `detallescarrito_ibfk_1` FOREIGN KEY (`CarritoID`) REFERENCES `carrito` (`CarritoID`),
  ADD CONSTRAINT `detallescarrito_ibfk_2` FOREIGN KEY (`ArticuloID`) REFERENCES `articulos` (`ID`),
  ADD CONSTRAINT `detallescarrito_ibfk_3` FOREIGN KEY (`carritoID`) REFERENCES `carrito` (`carritoID`),
  ADD CONSTRAINT `detallescarrito_ibfk_4` FOREIGN KEY (`articuloID`) REFERENCES `articulos` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
