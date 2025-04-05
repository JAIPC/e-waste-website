import React, { useState } from 'react';
import { Recycle, MapPin, Leaf, ArrowRight, X } from 'lucide-react';

export default function GreenCircuit() {
  const [showModal, setShowModal] = useState(false);

  return (
    <div className="bg-gray-950 text-white font-sans">
      {/* Hero Section */}
      <section className="min-h-screen flex flex-col justify-center items-center text-center px-6 py-20 bg-gradient-to-br from-blue-600 to-purple-500">
        <Recycle className="w-20 h-20 mb-6" />
        <h1 className="text-5xl md:text-6xl font-bold mb-4">Your Old Tech Deserves a Second Life</h1>
        <p className="text-xl md:text-2xl max-w-2xl mb-8">GreenCircuit helps communities transform e-waste into resources — for the planet, for the people, for the future.</p>
        <div className="flex flex-col sm:flex-row gap-4">
          <button className="bg-white text-black px-6 py-3 rounded-2xl font-semibold hover:bg-gray-200 transition-colors flex items-center justify-center gap-2">
            Start Recycling Today
            <ArrowRight className="w-5 h-5" />
          </button>
          <button 
            onClick={() => setShowModal(true)}
            className="border border-white px-6 py-3 rounded-2xl hover:bg-white hover:text-black transition-colors"
          >
            What is E-Waste?
          </button>
        </div>
      </section>

      {/* E-waste Modal */}
      {showModal && (
        <div className="fixed inset-0 bg-black/70 flex items-center justify-center p-4 z-50">
          <div className="bg-gray-800 rounded-2xl max-w-2xl w-full p-8 relative">
            <button 
              onClick={() => setShowModal(false)}
              className="absolute top-4 right-4 text-gray-400 hover:text-white"
            >
              <X className="w-6 h-6" />
            </button>
            
            <h2 className="text-3xl font-bold mb-6">🔌 What is E-waste?</h2>
            <p className="text-lg mb-6">
              E-waste means old or broken electronic items like phones, TVs, computers, and batteries.
            </p>

            <h3 className="text-2xl font-semibold mb-4 text-red-400">⚠ Why is it bad?</h3>
            <ul className="space-y-2 mb-6">
              <li className="flex items-center gap-2">
                <span className="text-red-400">•</span>
                Can pollute the environment
              </li>
              <li className="flex items-center gap-2">
                <span className="text-red-400">•</span>
                Can harm people's health
              </li>
              <li className="flex items-center gap-2">
                <span className="text-red-400">•</span>
                Wastes valuable materials like gold and copper
              </li>
            </ul>

            <h3 className="text-2xl font-semibold mb-4 text-green-400">✅ What to do?</h3>
            <ul className="space-y-2">
              <li className="flex items-center gap-2">
                <span className="text-green-400">•</span>
                Recycle old electronics
              </li>
              <li className="flex items-center gap-2">
                <span className="text-green-400">•</span>
                Don't throw them in the regular trash
              </li>
              <li className="flex items-center gap-2">
                <span className="text-green-400">•</span>
                Donate if still working
              </li>
            </ul>
          </div>
        </div>
      )}

      {/* Stats Section */}
      <section className="bg-gray-900 py-20 px-6 text-center">
        <h2 className="text-4xl font-bold mb-10">The E-Waste Problem</h2>
        <div className="grid md:grid-cols-3 gap-8 max-w-6xl mx-auto">
          <div className="bg-gray-800 p-8 rounded-2xl shadow-md transform hover:scale-105 transition-transform">
            <h3 className="text-4xl font-bold text-green-400">50M+ tons</h3>
            <p className="mt-2 text-gray-300">of e-waste produced globally every year</p>
          </div>
          <div className="bg-gray-800 p-8 rounded-2xl shadow-md transform hover:scale-105 transition-transform">
            <h3 className="text-4xl font-bold text-green-400">Only 17%</h3>
            <p className="mt-2 text-gray-300">gets properly recycled</p>
          </div>
          <div className="bg-gray-800 p-8 rounded-2xl shadow-md transform hover:scale-105 transition-transform">
            <h3 className="text-4xl font-bold text-green-400">#1 Fastest Growing</h3>
            <p className="mt-2 text-gray-300">waste stream on Earth</p>
          </div>
        </div>
      </section>

      {/* Approach Section */}
      <section className="py-20 px-6 bg-gray-950">
        <h2 className="text-4xl font-bold text-center mb-12">Our 3-Step Approach</h2>
        <div className="grid md:grid-cols-3 gap-8 max-w-6xl mx-auto">
          <div className="p-8 rounded-2xl bg-gray-800 hover:bg-gray-700 transition-colors">
            <MapPin className="w-12 h-12 text-green-400 mb-4" />
            <h3 className="text-2xl font-semibold mb-2">Smart Collection</h3>
            <p className="text-gray-300">Digital bins, drop-off events & mobile vans collect e-waste in your area.</p>
          </div>
          <div className="p-8 rounded-2xl bg-gray-800 hover:bg-gray-700 transition-colors">
            <Leaf className="w-12 h-12 text-green-400 mb-4" />
            <h3 className="text-2xl font-semibold mb-2">Safe Sorting</h3>
            <p className="text-gray-300">We safely separate harmful and valuable components — no toxic leaks here.</p>
          </div>
          <div className="p-8 rounded-2xl bg-gray-800 hover:bg-gray-700 transition-colors">
            <Recycle className="w-12 h-12 text-green-400 mb-4" />
            <h3 className="text-2xl font-semibold mb-2">Responsible Recycling</h3>
            <p className="text-gray-300">Your e-waste is processed by certified recyclers under global standards.</p>
          </div>
        </div>
      </section>

      {/* Circular Economy Section */}
      <section className="py-20 px-6 bg-gradient-to-b from-teal-600 to-green-500 text-center">
        <h2 className="text-4xl font-bold mb-6">Circular Economy: The Big Picture</h2>
        <p className="max-w-3xl mx-auto text-xl mb-8">Circular economy means keeping materials in use as long as possible — and we're bringing it to electronics.</p>
        <ul className="grid md:grid-cols-2 gap-6 text-left max-w-4xl mx-auto">
          <li className="flex items-center gap-3 bg-black/20 p-4 rounded-xl">
            <span className="text-2xl">✅</span>
            <span>Reduces mining & pollution</span>
          </li>
          <li className="flex items-center gap-3 bg-black/20 p-4 rounded-xl">
            <span className="text-2xl">✅</span>
            <span>Gives old tech a new purpose</span>
          </li>
          <li className="flex items-center gap-3 bg-black/20 p-4 rounded-xl">
            <span className="text-2xl">✅</span>
            <span>Supports local green jobs</span>
          </li>
          <li className="flex items-center gap-3 bg-black/20 p-4 rounded-xl">
            <span className="text-2xl">✅</span>
            <span>Builds a sustainable future</span>
          </li>
        </ul>
      </section>

      {/* Location Section */}
      <section className="py-20 px-6 bg-gray-950 text-center">
        <h2 className="text-4xl font-bold mb-6">Drop-Off Locations</h2>
        <p className="text-xl mb-8">Find a collection center near you.</p>
        <div className="grid gap-6 md:grid-cols-2 max-w-4xl mx-auto">
          <div className="bg-gray-800 p-8 rounded-2xl hover:bg-gray-700 transition-colors">
            <MapPin className="w-12 h-12 text-green-400 mb-4 mx-auto" />
            <h3 className="text-2xl font-semibold">Pune</h3>
            <p className="text-gray-300">Serving areas in and around Pune city.</p>
          </div>
          <div className="bg-gray-800 p-8 rounded-2xl hover:bg-gray-700 transition-colors">
            <MapPin className="w-12 h-12 text-green-400 mb-4 mx-auto" />
            <h3 className="text-2xl font-semibold">PCMC</h3>
            <p className="text-gray-300">Collection Center: <a href="https://maps.app.goo.gl/tAFc6ataNneZdoRj9?g_st=aw" className="text-green-400 underline hover:text-green-300" target="_blank" rel="noopener noreferrer">View on Google Maps</a></p>
          </div>
        </div>

        {/* Collection Drive Image */}
        <div className="mt-12">
          <img 
            src="https://images.unsplash.com/photo-1532996122724-e3c354a0b15b?ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80" 
            alt="E-Waste Collection Drive" 
            className="mx-auto rounded-xl shadow-lg w-full max-w-xl object-cover h-64"
          />
        </div>

        {/* Map */}
        <div className="mt-12">
          <iframe
            title="Google Map"
            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3783.535620315334!2d73.82120817506276!3d18.506750369615366!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc2bf659f73dd95%3A0xc4f8a54d107c10a1!2sE-waste%20Collection%20Center%2C%20PCMC!5e0!3m2!1sen!2sin!4v1712300000000!5m2!1sen!2sin"
            width="100%"
            height="400"
            style={{ border: 0 }}
            allowFullScreen={true}
            loading="lazy"
            referrerPolicy="no-referrer-when-downgrade"
            className="rounded-xl shadow-lg"
          />
        </div>
      </section>

      {/* Call to Action */}
      <section className="py-20 px-6 bg-gray-900 text-center">
        <h2 className="text-4xl font-bold mb-6">Think Before You Throw.</h2>
        <p className="text-xl mb-8">Get involved in your community and make a difference in how we handle e-waste.</p>
        <form className="max-w-xl mx-auto grid gap-4">
          <input 
            type="text" 
            placeholder="Your Name" 
            className="p-3 rounded-xl bg-gray-800 border border-gray-600 focus:border-green-400 focus:outline-none transition-colors" 
          />
          <input 
            type="email" 
            placeholder="Email Address" 
            className="p-3 rounded-xl bg-gray-800 border border-gray-600 focus:border-green-400 focus:outline-none transition-colors" 
          />
          <select className="p-3 rounded-xl bg-gray-800 border border-gray-600 focus:border-green-400 focus:outline-none transition-colors">
            <option>I'd like to...</option>
            <option>Schedule a Pickup</option>
            <option>Host an Event</option>
            <option>Learn More</option>
          </select>
          <button className="bg-green-500 hover:bg-green-400 text-black font-bold py-3 rounded-xl transition-colors">
            Submit
          </button>
        </form>
      </section>

      {/* Credits Section */}
      <footer className="py-8 px-6 bg-gray-950 text-center border-t border-gray-800">
        <p className="text-gray-400">
          Made with  by Atharva Jadhav, Anurag Biradar, Atharva Sandbhor, Prajwal Bhujbal and Chaitanya Veer
        </p>
      </footer>
    </div>
  );
}