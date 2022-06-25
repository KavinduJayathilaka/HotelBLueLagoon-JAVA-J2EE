<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <title class="titlem"></title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta content="" name="keywords" />
    <meta content="" name="description" />

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon" />

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&family=Montserrat:wght@400;500;600;700&display=swap"
      rel="stylesheet"
    />

    <!-- Icon Font Stylesheet -->
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
      rel="stylesheet"
    />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
      rel="stylesheet"
    />

    <!-- Libraries Stylesheet -->
    <link href="lib/animate/animate.min.css" rel="stylesheet" />
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet" />
    <link
      href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css"
      rel="stylesheet"
    />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet" />

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet" />
  </head>

  <body>
    <div class="container-xxl bg-white p-0">
      <!-- Spinner Start -->
      <div
        id="spinner"
        class="
          show
          bg-white
          position-fixed
          translate-middle
          w-100
          vh-100
          top-50
          start-50
          d-flex
          align-items-center
          justify-content-center
        "
      >
        <div
          class="spinner-border text-primary"
          style="width: 3rem; height: 3rem"
          role="status"
        >
          <span class="sr-only">Loading...</span>
        </div>
      </div>
      <!-- Spinner End -->

      <!-- Header Start -->
      <div class="container-fluid bg-dark px-0">
        <div class="row gx-0">
          <div class="col-lg-3 bg-dark d-none d-lg-block">
            <a
              href="Home"
              class="
                navbar-brand
                w-100
                h-100
                m-0
                p-0
                d-flex
                align-items-center
                justify-content-center
              "
            >
              <h1 class="m-0 text-primary text-uppercase">Blue Lagoon</h1>
            </a>
          </div>
          <div class="col-lg-9">
            <div class="row gx-0 bg-white d-none d-lg-flex">
              <div class="col-lg-7 px-5 text-start">
                <div class="h-100 d-inline-flex align-items-center py-2 me-4">
                  <i class="fa fa-envelope text-primary me-2"></i>
                  <p class="mb-0">bluelagoon@gmail.com</p>
                </div>
                <div class="h-100 d-inline-flex align-items-center py-2">
                  <i class="fa fa-phone-alt text-primary me-2"></i>
                  <p class="mb-0">+9411 345 6789</p>
                </div>
              </div>
              <div class="col-lg-5 px-5 text-end">
                <div class="d-inline-flex align-items-center py-2">
                  <a class="me-3" href=""><i class="fab fa-facebook-f"></i></a>
                  <a class="me-3" href=""><i class="fab fa-twitter"></i></a>
                  <a class="me-3" href=""><i class="fab fa-linkedin-in"></i></a>
                  <a class="me-3" href=""><i class="fab fa-instagram"></i></a>
                  <a class="me-3" href="AdminLogin.jsp"><i class="" ><b>Login</b></i></a>
                </div>
              </div>
            </div>
            <nav class="navbar navbar-expand-lg bg-dark navbar-dark p-3 p-lg-0">
              <a href="index.html" class="navbar-brand d-block d-lg-none">
                <h1 class="m-0 text-primary text-uppercase">Blue Lagoon</h1>
              </a>
              <button
                type="button"
                class="navbar-toggler"
                data-bs-toggle="collapse"
                data-bs-target="#navbarCollapse"
              >
                <span class="navbar-toggler-icon"></span>
              </button>
              <div
                class="collapse navbar-collapse justify-content-between"
                id="navbarCollapse"
              >
                <div class="navbar-nav mr-auto py-0">
                  <a href="Home" class="nav-item nav-link active">Home</a>
                  <a href="About" class="nav-item nav-link">About</a>
                  <a href="Services" class="nav-item nav-link">Services</a>
                  <a href="Room" class="nav-item nav-link">Rooms</a>
                  <div class="nav-item dropdown">
                    <a
                      href="#"
                      class="nav-link dropdown-toggle"
                      data-bs-toggle="dropdown"
                      >Pages</a
                    >
                    <div class="dropdown-menu rounded-0 m-0">
                      <a href="Booking" class="dropdown-item">Booking</a>
                      <a href="Team" class="dropdown-item">Our Team</a>
                      <a href="Testimonial" class="dropdown-item"
                        >Testimonial</a
                      >
                    </div>
                  </div>
                  <a href="Contact" class="nav-item nav-link">Contact</a>
                </div>
             
              </div>
            </nav>
          </div>
        </div>
      </div>
      <!-- Header End -->

      <!-- Carousel Start -->
      <div class="container-fluid p-0 mb-5">
        <div
          id="header-carousel"
          class="carousel slide"
          data-bs-ride="carousel"
        >
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img class="w-100" src="img/carousel-1.jpg" alt="Image" />
              <div
                class="
                  carousel-caption
                  d-flex
                  flex-column
                  align-items-center
                  justify-content-center
                "
              >
                <div class="p-3" style="max-width: 700px">
                  <h6
                    class="
                      section-title
                      text-white text-uppercase
                      mb-3
                      animated
                      slideInDown
                    "
                  >
                    Luxury Living
                  </h6>
                  <h1 class="display-3 text-white mb-4 animated slideInDown">
                   Hey , there !!..
                  </h1>
                  <a
                    href="Room"
                    class="
                      btn btn-primary
                      py-md-3
                      px-md-5
                      me-3
                      animated
                      slideInLeft
                    "
                    >Our Rooms</a
                  >
                  <a
                    href="Booking"
                    class="btn btn-light py-md-3 px-md-5 animated slideInRight"
                    >Book A Room</a
                  >
                </div>
              </div>
            </div>
            <div class="carousel-item">
              <img class="w-100" src="img/carousel-2.jpg" alt="Image" />
              <div
                class="
                  carousel-caption
                  d-flex
                  flex-column
                  align-items-center
                  justify-content-center
                "
              >
                <div class="p-3" style="max-width: 700px">
                  <h6
                    class="
                      section-title
                      text-white text-uppercase
                      mb-3
                      animated
                      slideInDown
                    "
                  >
                    Luxury Living
                  </h6>
                  <h1 class="display-3 text-white mb-4 animated slideInDown">
                    Wellcome you all to Blue Lagoon Hotel
                  </h1>
                  <a
                    href="booking.html"
                    class="
                      btn btn-primary
                      py-md-3
                      px-md-5
                      me-3
                      animated
                      slideInLeft
                    "
                    >Our Rooms</a
                  >
                  <a
                    href=""
                    class="btn btn-light py-md-3 px-md-5 animated slideInRight"
                    >Book A Room</a
                  >
                </div>
              </div>
            </div>
          </div>
          <button
            class="carousel-control-prev"
            type="button"
            data-bs-target="#header-carousel"
            data-bs-slide="prev"
          >
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
          </button>
          <button
            class="carousel-control-next"
            type="button"
            data-bs-target="#header-carousel"
            data-bs-slide="next"
          >
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
          </button>
        </div>
      </div>
      <!-- Carousel End -->

      <!-- Booking Start -->
      <div
        class="container-fluid booking pb-5 wow fadeIn"
        data-wow-delay="0.1s"
      >
        <div class="container">
          <div class="bg-white shadow" style="padding: 35px">
            <div class="row g-2">
              <div class="col-md-10">
                <div class="row g-2">
                  <div class="col-md-3">
                    <div class="date" id="date1" data-target-input="nearest">
                      <input
                        type="text"
                        class="form-control datetimepicker-input"
                        placeholder="Check in"
                        data-target="#date1"
                        data-toggle="datetimepicker"
                      />
                    </div>
                  </div>
                  <div class="col-md-3">
                    <div class="date" id="date2" data-target-input="nearest">
                      <input
                        type="text"
                        class="form-control datetimepicker-input"
                        placeholder="Check out"
                        data-target="#date2"
                        data-toggle="datetimepicker"
                      />
                    </div>
                  </div>
                  <div class="col-md-3">
                    <select class="form-select">
                      <option selected>Adult</option>
                      <option value="1">Adult 1</option>
                      <option value="2">Adult 2</option>
                      <option value="3">Adult 3</option>
                    </select>
                  </div>
                  <div class="col-md-3">
                    <select class="form-select">
                      <option selected>Child</option>
                      <option value="1">Child 1</option>
                      <option value="2">Child 2</option>
                      <option value="3">Child 3</option>
                    </select>
                  </div>
                </div>
              </div>
              <div class="col-md-2">
                <button class="btn btn-primary w-100">Submit</button>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Booking End -->

      <!-- About Start -->
      <div class="container-xxl py-5">
        <div class="container">
          <div class="row g-5 align-items-center">
            <div class="col-lg-6">
              <h6 class="section-title text-start text-primary text-uppercase">
                About Us
              </h6>
              <h1 class="mb-4">
                Welcome to
                <span class="text-primary text-uppercase">Blue Lagoon</span>
              </h1>
              <p class="mb-4">
                Blue Lagoon Hotel offers ultimate comfort and luxury. This 4-storied hotel is a beautiful combination of traditional grandeur and modern facilities. The 100 exclusive guest rooms are furnished with a range of modern amenities such as television and internet access, a private bathroom with shower, a TV, and free tea and coffee facilities are provided in each bright room. Whether traveling for business or pleasure, your stay at the Blue Lagoon is sure to be more comfortable, productive and enjoyable than ever before.


              </p>
              <div class="row g-3 pb-4">
                <div class="col-sm-4 wow fadeIn" data-wow-delay="0.1s">
                  <div class="border rounded p-1">
                    <div class="border rounded text-center p-4">
                      <i class="fa fa-hotel fa-2x text-primary mb-2"></i>
                      <h2 class="mb-1" data-toggle="counter-up">100</h2>
                      <p class="mb-0">Rooms</p>
                    </div>
                  </div>
                </div>
                <div class="col-sm-4 wow fadeIn" data-wow-delay="0.3s">
                  <div class="border rounded p-1">
                    <div class="border rounded text-center p-4">
                      <i class="fa fa-users-cog fa-2x text-primary mb-2"></i>
                      <h2 class="mb-1" data-toggle="counter-up">200</h2>
                      <p class="mb-0">Staffs</p>
                    </div>
                  </div>
                </div>
                <div class="col-sm-4 wow fadeIn" data-wow-delay="0.5s">
                  <div class="border rounded p-1">
                    <div class="border rounded text-center p-4">
                      <i class="fa fa-users fa-2x text-primary mb-2"></i>
                      <h2 class="mb-1" data-toggle="counter-up">1545</h2>
                      <p class="mb-0">Clients</p>
                    </div>
                  </div>
                </div>
              </div>
              <a class="btn btn-primary py-3 px-5 mt-2" href="Services">Explore More</a>
            </div>
            <div class="col-lg-6">
              <div class="row g-3">
                <div class="col-6 text-end">
                  <img
                    class="img-fluid rounded w-75 wow zoomIn"
                    data-wow-delay="0.1s"
                    src="img/about 1.jpg"
                    style="margin-top: 25%"
                  />
                </div>
                <div class="col-6 text-start">
                  <img
                    class="img-fluid rounded w-100 wow zoomIn"
                    data-wow-delay="0.3s"
                    src="img/about 2.jpg"
                  />
                </div>
                <div class="col-6 text-end">
                  <img
                    class="img-fluid rounded w-50 wow zoomIn"
                    data-wow-delay="0.5s"
                    src="img/about 3.jpg"
                  />
                </div>
                <div class="col-6 text-start">
                  <img
                    class="img-fluid rounded w-75 wow zoomIn"
                    data-wow-delay="0.7s"
                    src="img/about 4.jpg"
                  />
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- About End -->

      <!-- Room Start -->
      <div class="container-xxl py-5">
        <div class="container">
          <div class="text-center wow fadeInUp" data-wow-delay="0.1s">
            <h6 class="section-title text-center text-primary text-uppercase">
              Our Rooms
            </h6>
            <h1 class="mb-5">
              Explore Our <span class="text-primary text-uppercase">Rooms</span>
            </h1>
          </div>
          <div class="row g-4">
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
              <div class="room-item shadow rounded overflow-hidden">
                <div class="position-relative">
                  <img class="img-fluid" src="img/room-1.jpg" alt="" />
                  <small
                    class="
                      position-absolute
                      start-0
                      top-100
                      translate-middle-y
                      bg-primary
                      text-white
                      rounded
                      py-1
                      px-3
                      ms-4
                    "
                    >$100/Night</small
                  >
                </div>
                <div class="p-4 mt-2">
                  <div class="d-flex justify-content-between mb-3">
                    <h5 class="mb-0">Junior Suite</h5>
                    <div class="ps-2">
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                    </div>
                  </div>
                  <div class="d-flex mb-3">
                    <small class="border-end me-3 pe-3"
                      ><i class="fa fa-bed text-primary me-2"></i>3 Bed</small
                    >
                    <small class="border-end me-3 pe-3"
                      ><i class="fa fa-bath text-primary me-2"></i>2 Bath</small
                    >
                    <small
                      ><i class="fa fa-wifi text-primary me-2"></i>Wifi</small
                    >
                  </div>
                  <p class="text-body mb-3">
                    Look upon views of the iconic Blue Lagoon from your spacious living room,
                                    or from your supreme comfort of your bedroom on the second floor.
                                    We offer a rich selection of facilities and amenities to guests,
                                    although please note that some may incur an additional fee.
                  </p>
                  <div class="d-flex justify-content-between">
                    <a class="btn btn-sm btn-primary rounded py-2 px-4" href="Room"
                      >View Detail</a
                    >
                    <a class="btn btn-sm btn-dark rounded py-2 px-4" href="Booking"
                      >Book Now</a
                    >
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
              <div class="room-item shadow rounded overflow-hidden">
                <div class="position-relative">
                  <img class="img-fluid" src="img/room-2.jpg" alt="" />
                  <small
                    class="
                      position-absolute
                      start-0
                      top-100
                      translate-middle-y
                      bg-primary
                      text-white
                      rounded
                      py-1
                      px-3
                      ms-4
                    "
                    >$100/Night</small
                  >
                </div>
                <div class="p-4 mt-2">
                  <div class="d-flex justify-content-between mb-3">
                    <h5 class="mb-0">Executive Suite</h5>
                    <div class="ps-2">
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                    </div>
                  </div>
                  <div class="d-flex mb-3">
                    <small class="border-end me-3 pe-3"
                      ><i class="fa fa-bed text-primary me-2"></i>3 Bed</small
                    >
                    <small class="border-end me-3 pe-3"
                      ><i class="fa fa-bath text-primary me-2"></i>2 Bath</small
                    >
                    <small
                      ><i class="fa fa-wifi text-primary me-2"></i>Wifi</small
                    >
                  </div>
                  <p class="text-body mb-3">
                    Enjoy the breathtaking views of the Indian Ocean with your family and 
                    friends,and relax in expansive living areas with Two king size beds or, 
                    one king size bed and twin beds.We offer a rich 
                    selection of facilities and amenities to guests, note that some may incur an additional fee
                  </p>
                  <div class="d-flex justify-content-between">
                    <a class="btn btn-sm btn-primary rounded py-2 px-4" href="Room"
                      >View Detail</a
                    >
                    <a class="btn btn-sm btn-dark rounded py-2 px-4" href="Booking"
                      >Book Now</a
                    >
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.6s">
              <div class="room-item shadow rounded overflow-hidden">
                <div class="position-relative">
                  <img class="img-fluid" src="img/room-3.jpg" alt="" />
                  <small
                    class="
                      position-absolute
                      start-0
                      top-100
                      translate-middle-y
                      bg-primary
                      text-white
                      rounded
                      py-1
                      px-3
                      ms-4
                    "
                    >$100/Night</small
                  >
                </div>
                <div class="p-4 mt-2">
                  <div class="d-flex justify-content-between mb-3">
                    <h5 class="mb-0">Super Deluxe</h5>
                    <div class="ps-2">
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                      <small class="fa fa-star text-primary"></small>
                    </div>
                  </div>
                  <div class="d-flex mb-3">
                    <small class="border-end me-3 pe-3"
                      ><i class="fa fa-bed text-primary me-2"></i>3 Bed</small
                    >
                    <small class="border-end me-3 pe-3"
                      ><i class="fa fa-bath text-primary me-2"></i>2 Bath</small
                    >
                    <small
                      ><i class="fa fa-wifi text-primary me-2"></i>Wifi</small
                    >
                  </div>
                  <p class="text-body mb-3">
                   Enjoy a suite designed for high society. Watch the tranquil waters flow 
                                    beneath you through floor-to-ceiling windows,
                                    and recline in your two grand and luxurious bedrooms, 
                                    served by two separate dressing rooms and two private bars. While enjoying the beautiful sunset
                  </p>
                  <div class="d-flex justify-content-between">
                    <a class="btn btn-sm btn-primary rounded py-2 px-4" href="Room"
                      >View Detail</a
                    >
                    <a class="btn btn-sm btn-dark rounded py-2 px-4" href="Booking"
                      >Book Now</a
                    >
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Room End -->

      <!-- Video Start -->
      <div class="container-xxl py-5 px-0 wow zoomIn" data-wow-delay="0.1s">
        <div class="row g-0">
          <div class="col-md-6 bg-dark d-flex align-items-center">
            <div class="p-5">
              <h6
                class="section-title text-start text-white text-uppercase mb-3"
              >
                Luxury Living
              </h6>
              <h1 class="text-white mb-4">Discover A Brand Luxurious Hotel</h1>
              <p class="text-white mb-4">
                 Blue Lagoon Hotel offers ultimate comfort and luxury. This 4-storied hotel is a beautiful combination of traditional grandeur and modern facilities. The 100 exclusive guest rooms are furnished with a range of modern amenities such as television and internet access, a private bathroom with shower, a TV, and free tea and coffee facilities are provided in each bright room. Whether traveling for business or pleasure, your stay at the Blue Lagoon is sure to be more comfortable, productive and enjoyable than ever before.
              </p>
              <a href="Room" class="btn btn-primary py-md-3 px-md-5 me-3"
                >Our Rooms</a
              >
              <a href="Booking" class="btn btn-light py-md-3 px-md-5">Book A Room</a>
            </div>
          </div>
          <div class="col-md-6">
            <div class="video">
              <button
                type="button"
                class="btn-play"
                data-bs-toggle="modal"
                data-src="https://www.youtube.com/embed/DWRcNpR6Kdc"
                data-bs-target="#videoModal"
              >
                <span></span>
              </button>
            </div>
          </div>
        </div>
      </div>

      <div
        class="modal fade"
        id="videoModal"
        tabindex="-1"
        aria-labelledby="exampleModalLabel"
        aria-hidden="true"
      >
        <div class="modal-dialog">
          <div class="modal-content rounded-0">
            <div class="modal-header">
              <h5 class="modal-title" id="exampleModalLabel">Youtube Video</h5>
              <button
                type="button"
                class="btn-close"
                data-bs-dismiss="modal"
                aria-label="Close"
              ></button>
            </div>
            <div class="modal-body">
              <!-- 16:9 aspect ratio -->
              <div class="ratio ratio-16x9">
                <iframe
                  class="embed-responsive-item"
                  src=""
                  id="video"
                  allowfullscreen
                  allowscriptaccess="always"
                  allow="autoplay"
                ></iframe>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Video Start -->

      <!-- Service Start -->
      <div class="container-xxl py-5">
        <div class="container">
          <div class="text-center wow fadeInUp" data-wow-delay="0.1s">
            <h6 class="section-title text-center text-primary text-uppercase">
              Our Services
            </h6>
            <h1 class="mb-5">
              Explore Our
              <span class="text-primary text-uppercase">Services</span>
            </h1>
          </div>
          <div class="row g-4">
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
              <a class="service-item rounded" href="gallery/rooms/index.html">
                <div class="service-icon bg-transparent border rounded p-1">
                  <div
                    class="
                      w-100
                      h-100
                      border
                      rounded
                      d-flex
                      align-items-center
                      justify-content-center
                    "
                  >
                    <i class="fa fa-hotel fa-2x text-primary"></i>
                  </div>
                </div>
                <h5 class="mb-3">Rooms & Appartment</h5>
                <p class="text-body mb-0">
                 we offer you the most luxurious rooms in our hotel than any other hotel.
                </p>
              </a>
            </div>
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.2s">
              <a class="service-item rounded" href="gallery/food/index.html">
                <div class="service-icon bg-transparent border rounded p-1">
                  <div
                    class="
                      w-100
                      h-100
                      border
                      rounded
                      d-flex
                      align-items-center
                      justify-content-center
                    "
                  >
                    <i class="fa fa-utensils fa-2x text-primary"></i>
                  </div>
                </div>
                <h5 class="mb-3">Food & Restaurant</h5>
                <p class="text-body mb-0">
                 Choose between many cuisines from our highly skilled chefs.
                </p>
              </a>
            </div>
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
              <a class="service-item rounded" href="gallery/spa/index.html">
                <div class="service-icon bg-transparent border rounded p-1">
                  <div
                    class="
                      w-100
                      h-100
                      border
                      rounded
                      d-flex
                      align-items-center
                      justify-content-center
                    "
                  >
                    <i class="fa fa-spa fa-2x text-primary"></i>
                  </div>
                </div>
                <h5 class="mb-3">Spa & Fitness</h5>
                <p class="text-body mb-0">
                Brings you the best luxury Ayurveda products to help relax and rejuvenate to soothe your mind.
                </p>
              </a>
            </div>
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.4s">
              <a class="service-item rounded" href="gallery/sport/index.html">
                <div class="service-icon bg-transparent border rounded p-1">
                  <div
                    class="
                      w-100
                      h-100
                      border
                      rounded
                      d-flex
                      align-items-center
                      justify-content-center
                    "
                  >
                    <i class="fa fa-swimmer fa-2x text-primary"></i>
                  </div>
                </div>
                <h5 class="mb-3">Sports & Gaming</h5>
                <p class="text-body mb-0">
                 Enjoy your wonderful vacation with over 30 sports to choose between in our sports club.
                </p>
              </a>
            </div>
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.5s">
              <a class="service-item rounded" href="gallery/event/index.html">
                <div class="service-icon bg-transparent border rounded p-1">
                  <div
                    class="
                      w-100
                      h-100
                      border
                      rounded
                      d-flex
                      align-items-center
                      justify-content-center
                    "
                  >
                    <i class="fa fa-glass-cheers fa-2x text-primary"></i>
                  </div>
                </div>
                <h5 class="mb-3">Event & Party</h5>
                <p class="text-body mb-0">
                 Book your event in our amazing banquet halls and reception hall to get an unique luxury experience.
                </p>
              </a>
            </div>
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.6s">
              <a class="service-item rounded" href="gallery/gym/index.html">
                <div class="service-icon bg-transparent border rounded p-1">
                  <div
                    class="
                      w-100
                      h-100
                      border
                      rounded
                      d-flex
                      align-items-center
                      justify-content-center
                    "
                  >
                    <i class="fa fa-dumbbell fa-2x text-primary"></i>
                  </div>
                </div>
                <h5 class="mb-3">GYM & Yoga</h5>
                <p class="text-body mb-0">
                  Our state-of-the-art gym floor has a wide range of cardio, free weights,  plate loaded, pin loaded, and functional training best calss .
                </p>
              </a>
            </div>
          </div>
        </div>
      </div>
      <!-- Service End -->

      <!-- Testimonial Start -->
      <div
        class="container-xxl testimonial my-5 py-5 bg-dark wow zoomIn"
        data-wow-delay="0.1s"
      >
        <div class="container">
          <div class="owl-carousel testimonial-carousel py-5">
            <div
              class="
                testimonial-item
                position-relative
                bg-white
                rounded
                overflow-hidden
              "
            >
                <p>
                    This was luxary but in a beachy,relaxed way..It was a great place tosit back and relax. The lagoon made it into something special.
                </p>
              <div class="d-flex align-items-center">
                <img
                  class="img-fluid flex-shrink-0 rounded"
                  src="img/testimonial-1.jpg"
                  style="width: 45px; height: 45px"
                />
                <div class="ps-3">
                  <h6 class="fw-bold mb-1">Sara Abeywardhana</h6>
                  <small>Kandy, Sri Lanka</small>
                </div>
              </div>
              <i
                class="
                  fa fa-quote-right fa-3x
                  text-primary
                  position-absolute
                  end-0
                  bottom-0
                  me-4
                  mb-n1
                "
              ></i>
            </div>
            <div
              class="
                testimonial-item
                position-relative
                bg-white
                rounded
                overflow-hidden
              "
            >
                <p>
                    The food was fabulous, the staff extremely helpful. <br>Recomended!
                </p>
              <div class="d-flex align-items-center">
                <img
                  class="img-fluid flex-shrink-0 rounded"
                  src="img/testimonial-2.jpg"
                  style="width: 45px; height: 45px"
                />
                <div class="ps-3">
                  <h6 class="fw-bold mb-1">Rehan Perera</h6>
                  <small>Colombo, Sri Lanka</small>
                </div>
              </div>
              <i
                class="
                  fa fa-quote-right fa-3x
                  text-primary
                  position-absolute
                  end-0
                  bottom-0
                  me-4
                  mb-n1
                "
              ></i>
            </div>
            <div
              class="
                testimonial-item
                position-relative
                bg-white
                rounded
                overflow-hidden
              "
            >
                <p>
                    Nice and friendly staff. Very clean and spacious rooms. The buffet spread was absolutely fantastic!!!
                </p>
              <div class="d-flex align-items-center">
                <img
                  class="img-fluid flex-shrink-0 rounded"
                  src="img/testimonial-3.jpg"
                  style="width: 45px; height: 45px"
                />
                <div class="ps-3">
                  <h6 class="fw-bold mb-1">Kasun Soyza</h6>
                  <small>Kandy, Colombo</small>
                </div>
              </div>
              <i
                class="
                  fa fa-quote-right fa-3x
                  text-primary
                  position-absolute
                  end-0
                  bottom-0
                  me-4
                  mb-n1
                "
              ></i>
            </div>
          </div>
        </div>
      </div>
      <!-- Testimonial End -->

      <!-- Team Start -->
      <div class="container-xxl py-5">
        <div class="container">
          <div class="text-center wow fadeInUp" data-wow-delay="0.1s">
            <h6 class="section-title text-center text-primary text-uppercase">
              Our Team
            </h6>
            <h1 class="mb-5">
              Explore Our
              <span class="text-primary text-uppercase">Staffs</span>
            </h1>
          </div>
          <div class="row g-4">
            <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
              <div class="rounded shadow overflow-hidden">
                <div class="position-relative">
                  <img class="img-fluid" src="img/team-1.jpg" alt="" />
                  <div
                    class="
                      position-absolute
                      start-50
                      top-100
                      translate-middle
                      d-flex
                      align-items-center
                    "
                  >
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-facebook-f"></i
                    ></a>
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-twitter"></i
                    ></a>
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-instagram"></i
                    ></a>
                  </div>
                </div>
                <div class="text-center p-4 mt-3">
                  <h5 class="fw-bold mb-0">Mr. K M Sooriyabandara</h5>
                  <small>Director</small>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
              <div class="rounded shadow overflow-hidden">
                <div class="position-relative">
                  <img class="img-fluid" src="img/team-2.jpg" alt="" />
                  <div
                    class="
                      position-absolute
                      start-50
                      top-100
                      translate-middle
                      d-flex
                      align-items-center
                    "
                  >
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-facebook-f"></i
                    ></a>
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-twitter"></i
                    ></a>
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-instagram"></i
                    ></a>
                  </div>
                </div>
                <div class="text-center p-4 mt-3">
                  <h5 class="fw-bold mb-0">Mr. Kevin Perera</h5>
                  <small>Hotel Manager</small>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.5s">
              <div class="rounded shadow overflow-hidden">
                <div class="position-relative">
                  <img class="img-fluid" src="img/team-3.jpg" alt="" />
                  <div
                    class="
                      position-absolute
                      start-50
                      top-100
                      translate-middle
                      d-flex
                      align-items-center
                    "
                  >
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-facebook-f"></i
                    ></a>
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-twitter"></i
                    ></a>
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-instagram"></i
                    ></a>
                  </div>
                </div>
                <div class="text-center p-4 mt-3">
                  <h5 class="fw-bold mb-0">Ms. Shenaya Peiris</h5>
                  <small>HR Manager</small>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.7s">
              <div class="rounded shadow overflow-hidden">
                <div class="position-relative">
                  <img class="img-fluid" src="img/team-4.jpg" alt="" />
                  <div
                    class="
                      position-absolute
                      start-50
                      top-100
                      translate-middle
                      d-flex
                      align-items-center
                    "
                  >
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-facebook-f"></i
                    ></a>
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-twitter"></i
                    ></a>
                    <a class="btn btn-square btn-primary mx-1" href=""
                      ><i class="fab fa-instagram"></i
                    ></a>
                  </div>
                </div>
                <div class="text-center p-4 mt-3">
                  <h5 class="fw-bold mb-0">Mr. Dudley Senanayake</h5>
                  <small>Head Chef</small>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Team End -->

      <!-- Newsletter Start -->
      <div class="container newsletter mt-5 wow fadeIn" data-wow-delay="0.1s">
         
        <div class="row justify-content-center">
          <div class="col-lg-10 border rounded p-1">
            <div class="border rounded text-center p-1">
              <div class="bg-white rounded text-center p-5">
                <h4 class="mb-4">
                  Drop Your
                  <span class="text-primary text-uppercase">FeedBack !</span>
                </h4>
                 
                <div class="position-relative mx-auto" style="max-width: 400px">
                  <input
                    class="form-control w-100 py-3 ps-4 pe-5"
                    type="text"
                    placeholder="Share your feedback"
                  />
                  <button
                    type="button"
                    class="
                      btn btn-primary
                      py-2
                      px-3
                      position-absolute
                      top-0
                      end-0
                      mt-2
                      me-2
                    "
                  >
                    Submit
                  </button>
                </div>
              </div>
            </div>
          </div>
        </div>
        </form>

      </div>
      <!-- Newsletter Start -->

      <!-- Footer Start -->
      <div
        class="container-fluid bg-dark text-light footer wow fadeIn"
        data-wow-delay="0.1s"
      >
        <div class="container pb-5">
          <div class="row g-5">
            <div class="col-md-6 col-lg-4">
              <div class="bg-primary rounded p-4">
                <a href="index.html"
                  ><h1 class="text-white text-uppercase mb-3">Blue Lagoon</h1></a
                >
                <p class="text-white mb-0">
                  No matter where you choose to stay, we make sure you enjoy every minute of it. Be it the ocean, the forest or even the city, you’ll be able to soak it all in, with your feet up, hands down!
                </p>
              </div>
            </div>
            <div class="col-md-6 col-lg-3">
              <h6
                class="
                  section-title
                  text-start text-primary text-uppercase
                  mb-4
                "
              >
                Contact
              </h6>
              <p class="mb-2">
                <i class="fa fa-map-marker-alt me-3"></i>32 Ebenezer Pl, Negombo, Sri Lanka
              </p>
              <p class="mb-2">
                <i class="fa fa-phone-alt me-3"></i>+9411 345 6789
              </p>
              <p class="mb-2">
                <i class="fa fa-envelope me-3"></i>bluelagoon@gmail.com
              </p>
              <div class="d-flex pt-2">
                <a class="btn btn-outline-light btn-social" href=""
                  ><i class="fab fa-twitter"></i
                ></a>
                <a class="btn btn-outline-light btn-social" href=""
                  ><i class="fab fa-facebook-f"></i
                ></a>
                <a class="btn btn-outline-light btn-social" href=""
                  ><i class="fab fa-youtube"></i
                ></a>
                <a class="btn btn-outline-light btn-social" href=""
                  ><i class="fab fa-linkedin-in"></i
                ></a>
              </div>
            </div>
            <div class="col-lg-5 col-md-12">
              <div class="row gy-5 g-4">
                <div class="col-md-6">
                  <h6
                    class="
                      section-title
                      text-start text-primary text-uppercase
                      mb-4
                    "
                  >
                    Company
                  </h6>
                  <a class="btn btn-link" href="about.html">About Us</a>
                  <a class="btn btn-link" href="contact.html">Contact Us</a>
                  <a class="btn btn-link" href="">Privacy Policy</a>
                  <a class="btn btn-link" href="">Terms & Condition</a>
                  <a class="btn btn-link" href="">Support</a>
                </div>
                <div class="col-md-6">
                  <h6
                    class="
                      section-title
                      text-start text-primary text-uppercase
                      mb-4
                    "
                  >
                    Services
                  </h6>
                  <a class="btn btn-link" href="gallery/food/index.html">Food & Restaurant</a>
                  <a class="btn btn-link" href="gallery/spa/index.html">Spa & Fitness</a>
                  <a class="btn btn-link" href="gallery/sport/index.html">Sports & Gaming</a>
                  <a class="btn btn-link" href="gallery/event/index.html">Event & Party</a>
                  <a class="btn btn-link" href="gallery/gym/index.html">GYM & Yoga</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="container">
          <div class="copyright">
            <div class="row">
              <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
                &copy; <a class="border-bottom" href="#">Blue Lagoon hotel</a>
                
                Designed By
                <a class="border-bottom" href=""
                  >group 27</a
                >
              </div>
              <div class="col-md-6 text-center text-md-end">
                <div class="footer-menu">
                  <a href="index.html">Home</a>
                  <a href="">Cookies</a>
                  <a href="">Help</a>
                  <a href="">FQAs</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Footer End -->

      <!-- Back to Top -->
      <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"
        ><i class="bi bi-arrow-up"></i
      ></a>
    </div>

    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="lib/wow/wow.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/counterup/counterup.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="lib/tempusdominus/js/moment.min.js"></script>
    <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
    <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
  </body>
</html>
